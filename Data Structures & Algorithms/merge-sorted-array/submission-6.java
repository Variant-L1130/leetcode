class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] v = new int [m+n];
        
        for(int i=0;i<m;i++){
        if(nums1[i]==0){

        }
        v[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
        v[m+i] = nums2[i];  
        }
        Arrays.sort(v); 
        for(int i =0;i<v.length;i++){
            nums1[i] = v[i];
        }         
    }
}