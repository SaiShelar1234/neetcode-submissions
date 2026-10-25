//isalnum(s[i]) → checks whether the character is a letter or digit.
class Solution {
public:
    bool isPalindrome(string s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if(!isalnum(s[i]))
            {
                i++;
            }
            else if(!isalnum(s[j]))
            {
                j--;
            }
            else
            {
                char a = toupper(s[i]);
            char b = toupper(s[j]);

            if (a != b) {
                return false;
            }

            i++;
            j--;

            }
            
            
        }

        return true;
    }
};