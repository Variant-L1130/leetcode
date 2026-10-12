class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0,r=0;
        for(int q : piles){
            r = Math.max(r,q);
        }
        int res = r;
        while(l<=r){
            int m = (l+r)/2;
            int o =0;
            for (int q : piles){
                o += Math.ceil((double)q/m);
            }
            if(o<=h){
                res = Math.min(res,m);
                r = m-1;
            }else{
                l=m+1;
            }
        }
        return res;
        
    }
}
