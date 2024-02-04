package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Brute Force
	public static int maxProfitBF(int[] prices) {
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            for(int j =i;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
//	Optimal
	public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int buy = prices[0];
        
        for(int i =0;i<prices.length;i++) {
        	profit = prices[i]- buy;
        	if(profit < 0 ) {
        		buy = prices[i];
        	}
        	max = Math.max(max, profit);
        }
		
		
		return max;
    }
}
