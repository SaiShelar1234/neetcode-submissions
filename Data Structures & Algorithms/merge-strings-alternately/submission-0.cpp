class Solution {
public:
    string mergeAlternately(string nums1, string nums2) {
        string ans="";

        int i=0;
        int j=0;


        while(i<nums1.size()&&j<nums2.size())
        {
            ans+=nums1[i];
            ans+=nums2[j];
            i++;
            j++;
        }
        while(i<nums1.size())
        {
            ans+=nums1[i];
            i++;
        }
        while(j<nums2.size())
        {
            ans+=nums2[j];
            j++;
        }

        return ans;
    }
};