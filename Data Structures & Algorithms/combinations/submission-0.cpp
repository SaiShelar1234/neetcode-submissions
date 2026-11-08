class Solution {
//try to draw recurssion tree
public:
    vector<vector<int>> combine(int n, int k) {
        
        vector<vector<int>>ans;
        vector<int>temp;

        find(n,k,ans,temp);

        return ans;
    }

    void find(int n,int k,vector<vector<int>>&ans,vector<int>temp)
    {
        if(k==0)
        {
            ans.push_back(temp);
            return ;
        }

        if(n==0)
        {
            return ;
        }

        temp.push_back(n);
        find(n-1,k-1,ans,temp);
        temp.pop_back();
        find(n-1,k,ans,temp);

    }
};