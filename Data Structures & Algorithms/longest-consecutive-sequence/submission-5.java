class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for(int no : nums){
            n.add(no);
        }
        int lo = 0;
        for(int no : n){
            if(!n.contains(no-1)){
                int l = 1 ;
                while (n.contains(no+l)){
                    l++;
                }
                lo= Math.max(lo,l);
            }
        }
        return lo;
       
        
    }
}
