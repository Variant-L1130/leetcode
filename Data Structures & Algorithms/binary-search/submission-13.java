class Solution {
    public int search(int[] nums, int target) {
        int [] r = new int [nums.length],l = new int[nums.length];
        for(int i= 0;i<nums.length;i++){
            if(nums[i] == target ){
                r[i] = nums[i];
                return i;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]== target){
                l[i] = nums[i];
                return i;
            }
        }
        return -1 ;

    }
}
