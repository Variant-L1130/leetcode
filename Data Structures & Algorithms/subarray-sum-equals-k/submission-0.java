class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
       
        int cs=0,c=0;
        for(int i=0;i<nums.length;i++){
            cs +=nums[i];
            
            c +=m.getOrDefault(cs-k,0);
                m.put(cs,m.getOrDefault(cs,0)+1);
        }
        return c;
    }
}