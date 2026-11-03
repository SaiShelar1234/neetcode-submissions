class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        
        string a="";
        for(int i=0;i<strs[0].size();i++)
        {
            
            char ch=strs[0][i];
            bool ans=true;
            for(int j=1;j<strs.size();j++)
            {
                if(ch!=strs[j][i])
                {
                    ans=false;
                    break;
                }
            }

            if(ans==false)
            {
                break;
            }

            a+=ch;

        }

        return a;
    }


};