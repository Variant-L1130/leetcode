class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int c = m.getOrDefault(nums[i],0);
            c++;
            m.put(nums[i],c);
        }
           ArrayList<Integer> y = new ArrayList<>(m.keySet());  
           Collections.sort(y,(s,t) -> m.get(t) - m.get(s));
           int [] b = new int[k]; 
           for(int a=0;a<k;a++){
            b[a] = y.get(a);
        }
        return b; 
    }
}
