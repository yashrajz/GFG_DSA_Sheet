// www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2

public class StockBuyandSellMaxoneTransactionAllowed {
    public int maximumProfit(int prices[]) {
        
        int buyPrice = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            
            buyPrice = Math.min(buyPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }
        
        return maxProfit;
    }
}
