class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       {
        return false;
       }
       int arr[]=new int[26];
       
       int arr1[]=new int[26];

       for(int i=0;i<s.length();i++)
       {
          arr[s.charAt(i)-'a']++;
          arr1[t.charAt(i)-'a']++;
       }

       for(int i=0;i<26;i++)
       {
            if(arr[i]!=arr1[i])
            {
                return false;
            }
       }

       return true;


  }
}
