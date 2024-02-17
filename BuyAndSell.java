/**
 * @author Vikas Mehra
 * @date 17/02/24 4:06 PM
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class BuyAndSell {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minSoFar=Math.min(prices[i],minSoFar);
            maxProfit=Math.max(maxProfit,prices[i]-minSoFar);
        }
        return maxProfit;
    }
}
