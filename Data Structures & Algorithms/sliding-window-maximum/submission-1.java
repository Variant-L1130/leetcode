class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int [] result = new int[nums.length-k+1];
        for(int i =0; i<nums.length;i++){
            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.removeLast();
            }
            d.addLast(i);

            if(d.peekFirst()<i-k+1){
                d.removeFirst();
            }
            if(i>=k-1){
                result[i-k+1] = nums[d.peekFirst()];
            }
        }
        return result;
        
    }
}
