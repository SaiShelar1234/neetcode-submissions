
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int arr[128] = {0};

        int i = 0;
        int j = 0;
        int maxi = 0;

        while (j < s.size()) {
            if (arr[s[j]] == 1) {
                while (arr[s[j]] != 0 && i <= j) {
                    arr[s[i]]--;
                    i++;
                }
            }

            arr[s[j]]++;
            maxi = max(maxi, j - i + 1);

            j++;
        }

        return maxi;
    }
};
