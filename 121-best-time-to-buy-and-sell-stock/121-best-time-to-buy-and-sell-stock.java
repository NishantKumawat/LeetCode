class Solution {
    public int maxProfit(int[] prices) {
     
        int lowest=Integer.MAX_VALUE;
        int price=0,max=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(lowest>prices[i])
                lowest=prices[i];
            price=prices[i]-lowest;
            
            max=Math.max(max,price);
        }
        return max;
        
        
    }
}