
class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < word1.length() && j < word2.length())
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);

            ans.append(ch1);
            ans.append(ch2);

            i++;
            j++;
        }

        while(i < word1.length())
        {
            ans.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length())
        {
            ans.append(word2.charAt(j));
            j++;
        }

        return ans.toString();
    }
}
