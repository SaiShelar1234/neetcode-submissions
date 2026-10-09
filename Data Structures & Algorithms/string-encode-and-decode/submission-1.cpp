
class Solution {
public:
    string encode(vector<string>& strs) {
        string ans = "";

        for (const string& str : strs) {
            ans += to_string(str.size()) + "#" + str;
        }

        return ans;
    }

    vector<string> decode(string s) {
        vector<string> ans;
        int i = 0;

        while (i < s.size()) {
            int num = 0;

            while (s[i] != '#') {
                num = num * 10 + (s[i] - '0');
                i++;
            }

            i++; // Skip the length separator '#'

            ans.push_back(s.substr(i, num));

            i += num; // Skip the original string
        }

        return ans;
    }
};
