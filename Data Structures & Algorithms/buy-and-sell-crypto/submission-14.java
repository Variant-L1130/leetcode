class Solution {
    public int maxProfit(int[] prices) {
        int []a= new int[prices.length];
        int b=0,c=prices[0];
        for(int i=1;i<prices.length;i++){
            c = Math.min(c,prices[i]);
        int d = prices[i]-c;
        
        b = Math.max(b,d);            
        }
        return b;
        
    }
}
