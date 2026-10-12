class Solution {
    public int findMin(int[] nums) {
        int c = nums[0];
        for(int i = 0;i<nums.length;i++){
            c = Math.min(c,nums[i]);
        }
        return c;
    }
}
