
class Solution {

    boolean isAlpahnumeric(char ch)
    {
        if(ch >= 'a' && ch <= 'z' ||
           ch >= 'A' && ch <= 'Z' ||
           ch >= '0' && ch <= '9')
        {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j)
        {
            while(i < j && !isAlpahnumeric(s.charAt(i)))
            {
                i++;
            }

            while(i < j && !isAlpahnumeric(s.charAt(j)))
            {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) !=
               Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
