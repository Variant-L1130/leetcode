class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){
        int [] nums = nums1;
        nums1 = nums2;
        nums2 = nums;
        }
        int t = nums1.length+nums2.length;
        int h = (t+1)/2,l=0,r=nums1.length;
        while(l<=r){
            int m = (l+r)/2;
            int n = h-m;
            int nums1left = m>0 ? nums1[m-1]: Integer.MIN_VALUE;
            int nums1right = m<nums1.length ? nums1[m]: Integer.MAX_VALUE;
            int nums2left = n>0 ? nums2[n-1]: Integer.MIN_VALUE;
            int nums2right = n<nums2.length ? nums2[n]: Integer.MAX_VALUE;

            if(nums1left <= nums2right && nums1right >=nums2left){
                if(t%2!=0){
                    return Math.max(nums1left,nums2left);
                }
                return (Math.max(nums1left,nums2left)+Math.min(nums1right,nums2right))/2.0;
            } else if(nums1left > nums2right){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return -1;
    }
}
