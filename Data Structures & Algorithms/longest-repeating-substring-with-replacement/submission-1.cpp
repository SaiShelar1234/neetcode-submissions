class Solution {
public:
    int characterReplacement(string s, int k) {

        int arr[26]={0};

        int i=0;
        int j=0;
        int maxi=0;
        int ans=0;

        while(j<s.size())
        {
            arr[s[j]-'A']++;
            maxi=max(maxi,arr[s[j]-'A']);

            while((j-i+1)-maxi>k)
            {
                arr[s[i]-'A']--;
                i++;
            }


            ans=max(ans,j-i+1);
            j++;

        }

        return ans;
    }
};
