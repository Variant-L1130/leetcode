class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,c=nums[0];
        while(l<=r){
            if(nums[l]<nums[r]){
                c = Math.min(c,nums[l]);
                break;
            }
        int m = (l+r)/2;
        c = Math.min(c,nums[m]);
            if(nums[m]>=nums[l]){
                l = m+1;
            }
            else{
                r = m -1;
            }
         
        }
        return c;
    }
}
