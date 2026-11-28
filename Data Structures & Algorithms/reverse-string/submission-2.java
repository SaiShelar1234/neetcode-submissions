class Solution {
    public void reverseString(char[] s) {
        

        int i=0;
        int e=s.length-1;

        while(i<e)
        {
            char temp=s[i];
            s[i]=s[e];
            s[e]=temp;

            i++;
            e--;
        }
    }
}