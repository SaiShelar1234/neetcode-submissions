class Solution {
public:
    int mySqrt(int x) {
        
        int i=1;
        int j=x;
        int ans=0;


        while(i<=j)
        {
            int mid=i+(j-i)/2;
            long long val=1LL * mid*mid;

            if(val<=x)
            {
               ans=mid;
               i=mid+1;
            }
            else
            {
               j=mid-1;
            }
        }

        return ans;
    }
};