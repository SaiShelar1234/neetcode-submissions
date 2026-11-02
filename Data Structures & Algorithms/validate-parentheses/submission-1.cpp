class Solution {
public:
    bool isValid(string s) {
        
        stack<char>st;

        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='{'||s[i]=='('||s[i]=='[')
            {
                st.push(s[i]);
            }
            else
            {
                if(s[i]=='}'||s[i]==')'||s[i]==']')
                {
                    if(st.size()<1)
                    {
                        return false;
                    }
                    char ch=st.top();
                    st.pop();

                    if(ch=='{'&&s[i]!='}')
                    {
                        return false;
                    }
                    else if(ch=='('&&s[i]!=')')
                    {
                        return false;
                    }
                    else if(ch=='['&&s[i]!=']')
                    {
                        return false;
                    }
                }       
            }
        }

        if(st.size()==0)
        {
            return true;
        }

        return false;
    }
};
