class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int start = 0, end = 1;

        while(start < prices.length && end < prices.length) {
            if(prices[start] < prices[end]) {
                maxProfit = Math.max(maxProfit, prices[end] - prices[start]);
                end++;
            } else {
                start = end;
                end++;
            }
        }

        return maxProfit;
        
    }
}
