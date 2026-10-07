class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Integer> s = new Stack<>();
        double[][]a= new double[speed.length][2];
        int c=0;
        double q=0.0;
        for(int i=0;i<speed.length;i++){
            a[i][0] = position[i];
            a[i][1] = speed[i];
        }
        Arrays.sort(a,(d,b)-> Double.compare(b[0],d[0]));

        for(int i=0;i<speed.length;i++){
            double t =  (double)(target-a[i][0])/a[i][1];
            if(t>q){
                c++;
                q=t;
            }
        }
        return c;
    }
}
