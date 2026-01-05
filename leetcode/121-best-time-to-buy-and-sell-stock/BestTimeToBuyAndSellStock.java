/* * 
 * LC 121: Best Time To Buy And Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int temp = prices[right] - prices[left];
                maxProfit = Math.max(temp, maxProfit);
            } else 
                left = right;
            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
       System.out.println("profit: " + maxProfit(new int[]{5, 1, 5, 6, 10, 7, 1}));
    }
}