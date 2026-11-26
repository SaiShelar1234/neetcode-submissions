class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

 

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int num:map.keySet())
        {
            int val=map.get(num);
            bucket[val].add(num);
        }

        int []ans=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=1;i--)
        {
            for(int num:bucket[i])
            {
                ans[index++]=num;
                if(index==k)
                {
                    return ans;
                }
            }
        }

        return ans;
    }
}
