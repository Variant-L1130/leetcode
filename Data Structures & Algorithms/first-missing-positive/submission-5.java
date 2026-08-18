class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> m = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.add (nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!m.contains(i)){
                return i;
            }
        }
        return -1;
    }
}