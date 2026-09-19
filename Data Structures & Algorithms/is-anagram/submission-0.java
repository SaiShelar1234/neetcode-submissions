class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] A = s.toCharArray();
        char[] B = t.toCharArray();

        int[] a = new int[26];

        for (int i = 0; i < A.length; i++) {
            a[A[i] - 'a']++;
        }

        for (int i = 0; i < B.length; i++) {
            a[B[i] - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                return false;
            }
        }

        return true;
    }
}