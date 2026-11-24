//need to solve this problem using by visualizing array elements as linked list
//we are able to solve this problem only because elements are appearing from 1 to n+1
//here while traversing zero wont cause any issue
class Solution {
    public int findDuplicate(int[] nums) {
       
       int s=nums[0];
       int f=nums[0];

       do 
       {
         s=nums[s];
         f=nums[nums[f]];
       }
       while(s!=f);

       s=nums[0];

       while(s!=f)
       {
        s=nums[s];
        f=nums[f];
       }

       return s;
    }
}
