class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       Map<String,List<String>> mp=new HashMap<>();

       for(String str:strs)
       {
         
         int count[]=new int[26];
         for(int i=0;i<str.length();i++)
         {
            count[str.charAt(i)-'a']++;
         }

         String key=Arrays.toString(count);

         mp.putIfAbsent(key,new ArrayList<>());

         mp.get(key).add(str);

       }

       return new ArrayList<>(mp.values());
    }
}
