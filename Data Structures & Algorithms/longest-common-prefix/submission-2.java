class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        String temp = strs[0];

        for (int i = 0; i < temp.length(); i++) {

            char ch = temp.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans;
                }
            }

            ans += ch;
        }

        return ans;
    }
}