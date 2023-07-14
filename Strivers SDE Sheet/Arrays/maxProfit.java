//   Q:  Max sum in sub-arrays

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxprofit = 0;
        int least =  Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            profit = prices[i] - least;
            if(maxprofit < profit){
                maxprofit = profit;
            }
        }
             return maxprofit;
    }
}