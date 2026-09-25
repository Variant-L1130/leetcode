class Solution {
    public int maxProfit(int[] prices) {
        int []a= new int[prices.length];
        int b=0,c=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
        c = prices[j]-prices[i];
        
        b = Math.max(b,c);
            }
        }
        return b;
        
    }
}
