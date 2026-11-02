class Solution {
public:
    int evalRPN(vector<string>& tokens) {

        stack<int> st;

        for(int i = 0; i < tokens.size(); i++)
        {
            if(tokens[i] == "+" || tokens[i] == "-" ||
               tokens[i] == "*" || tokens[i] == "/")
            {
                int val1 = st.top();
                st.pop();

                int val2 = st.top();
                st.pop();

                int newVal;

                if(tokens[i] == "+")
                    newVal = val2 + val1;

                else if(tokens[i] == "-")
                    newVal = val2 - val1;

                else if(tokens[i] == "*")
                    newVal = val2 * val1;

                else
                    newVal = val2 / val1;

                st.push(newVal);
            }
            else
            {
                st.push(stoi(tokens[i]));
            }
        }

        return st.top();
    }
};