//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615

public class StockBuyandSellMultipleTransactionAllowed {
    public int maximumProfit(int prices[]) {
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        
        return profit;
    }
}
