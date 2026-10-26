//make sure you dont overcomplicate the logic thinking if both bars haning same height
class Solution {
public:
    int maxArea(vector<int>& heights) {
        int i=0;
        int j=heights.size()-1;
        int ans=INT_MIN;
        while(i<j)
        {
            int mini=min(heights[i],heights[j]);
            int w=j-i;
            ans=max(ans,w*mini);

            if(heights[i]<heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }

        return ans;
    }
};
