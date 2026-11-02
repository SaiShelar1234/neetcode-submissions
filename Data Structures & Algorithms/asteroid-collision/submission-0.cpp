class Solution {
public:
    vector<int> asteroidCollision(vector<int>& nums) {

        stack<int> st;

        for(int i = 0; i < nums.size(); i++)
        {
            if(nums[i] < 0)
            {
                bool ans = false;

                while(!st.empty() && st.top() > 0)
                {
                    if(st.top() < abs(nums[i]))
                    {
                        st.pop();
                    }
                    else if(st.top() == abs(nums[i]))
                    {
                        st.pop();
                        ans = true;
                        break;
                    }
                    else
                    {
                        ans = true;
                        break;
                    }
                }

                if(!ans)
                {
                    st.push(nums[i]);
                }
            }
            else
            {
                st.push(nums[i]);
            }
        }

        vector<int> result;

        while(!st.empty())
        {
            result.push_back(st.top());
            st.pop();
        }

        reverse(result.begin(), result.end());

        return result;
    }
};