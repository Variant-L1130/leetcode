class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int [] l= new int [n],r = new int [n];
        Stack<Integer> s = new Stack<>();

        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            r[i] =s.isEmpty() ? n : s.peek();
            s.push(i); 
        }

        while(!s.isEmpty()){
            s.pop();
        }

        for(int i = 0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>+ heights[i]){
            s.pop();
            }
            l[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i); 
        }

        int a = 0;
        for(int i=0;i<n;i++){
            int c = heights[i] * (r[i]-l[i]-1);
            a = Math.max(a,c);
        }
        return a;
        
    }
}