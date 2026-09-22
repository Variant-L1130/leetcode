class Solution {
    public int maxArea(int[] heights) {
        int i=0,a = 0,j=heights.length-1;
        while(i<j){
         a = Math.max(a,Math.min(heights[i],heights[j])*(j-i));
        
        if(heights[i]<heights[j]){
            i++;
        }
        else{
            j--;
        }
        
        }
        return a;
    }
}
