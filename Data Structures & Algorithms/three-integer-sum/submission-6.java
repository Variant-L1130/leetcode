class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> x = new ArrayList<>();
        Arrays.sort(nums);
        for(int k =0;k<nums.length -2;k++){
            if(k>0 && nums[k]==nums[k-1]) continue ;
            int i=k+1,j=nums.length-1;
            while(i<j){
                if(nums[i]+nums[j]+nums[k]<0){
                    i++;
                }
                else if (nums[i]+nums[j]+nums[k]>0){
                    j--;
                }
                else{
                   x.add(Arrays.asList(nums[k], nums[i], nums[j]));
                
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1]) i++;
                while(i<j && nums[j]==nums[j+1]) j--;
                }
            }
        }
        return (x);
    }
}
