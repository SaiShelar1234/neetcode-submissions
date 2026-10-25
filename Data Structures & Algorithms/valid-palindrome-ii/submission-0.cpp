class Solution {
public:
    bool validPalindrome(string s) {
        
        int i=0;
        int j=s.size()-1;
        
        bool l=true;
        bool r=true;
        
        int cnt=0;
        while(i<j)
        {
            if(cnt==0&&s[i]!=s[j])
            {
                i++;
                cnt++;
            }
            else
            {
                if(s[i]!=s[j])
                {
                    l=false;
                    break;
                }
                i++;
                j--;
            }
        }

        cnt=0;
        i=0;
        j=s.size()-1;

        while(i<j)
        {
            if(cnt==0&&s[i]!=s[j])
            {
                j--;
                cnt++;
            }
            else
            {
                if(s[i]!=s[j])
                {
                    r=false;
                    break;
                }
                i++;
                j--;
            }
        }

        if(l==false&&r==false)
        {
            return false;
        }

        return true;

    }
};