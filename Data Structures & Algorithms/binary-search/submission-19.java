class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length-1,l =0; 
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]>target){
            r = m-1;
            }else if(nums[m]<target){
                l=m+1;
            }
            else{
                return m;
            }

        }
        return -1 ;

    }
}
