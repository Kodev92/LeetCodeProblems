package leetcodeDS;

public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int min = prices[0], max = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++)
            if (prices[i] >= max) {
                max = prices[i];
                profit = Math.max(profit, max - min);
            } else if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
        return profit;


//        int profit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            int maxPrice = prices[i];
//
//            for (int j = i + 1; j < prices.length; j++)
//                if (prices[j] > maxPrice) maxPrice = prices[j];
//
//            if (maxPrice - prices[i] > profit) profit = maxPrice - prices[i];
//
//        }
//        return profit;

    }
}
