class Solution {
public:
    int calPoints(vector<string>& operations) {

        stack<int> st;

        for(int i = 0; i < operations.size(); i++)
        {
            if(operations[i] == "C")
            {
                st.pop();
            }
            else if(operations[i] == "D")
            {
                int val = st.top();
                st.push(val * 2);
            }
            else if(operations[i] == "+")
            {
                int val = st.top();
                st.pop();

                int val1 = st.top();

                st.push(val);
                st.push(val + val1);
            }
            else
            {
                int val = stoi(operations[i]);
                st.push(val);
            }
        }

        int sum = 0;

        while(!st.empty())
        {
            sum += st.top();
            st.pop();
        }

        return sum;
    }
};