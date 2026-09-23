class Solution {
    public int trap(int[] height) {
        int []maxLeft=new int[height.length],maxRight=new int[height.length];
        int t=0;
        maxLeft[0] = height[0];
        for(int i = 1;i<height.length-1;i++){
            maxLeft[i] = Math.max(maxLeft[i-1],height[i-1]);
        }
        maxRight[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>0;i--){
          maxRight[i] = Math.max(maxRight[i+1],height[i+1]);
        }
        for(int i=0;i<height.length;i++){
            int w = Math.min(maxLeft[i],maxRight[i]) - height[i];
            if(w>0){
                t+=w;
                }
            }
        return t;
        
    }
}
