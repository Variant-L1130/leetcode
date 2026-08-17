class Solution {
    public List<Integer> majorityElement(int[] nums) {
    HashMap<Integer,Integer> m = new HashMap<>();
    for(int n : nums){
        int c = m.getOrDefault(n,0);
        c++;
        m.put(n,c);
    }
    List<Integer> x = new ArrayList<>();
    for( int d : m.keySet()){
        if(m.get(d)>nums.length/3){
            x.add(d);
        }
    }
    return x;
    }
}