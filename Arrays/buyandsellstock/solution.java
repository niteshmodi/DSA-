// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


// it is a leetcode question

//First using brute force approach


class Solution {
    public int maxProfit(int[] prices) {
         int maxprofit = 0;
       for (int buy=0; buy<prices.length; buy++){
             int profit =0;
             for (int sell=buy+1;  sell<prices.length;sell++){
                 if (prices[sell] - prices[buy] > profit){
                     profit = prices[sell]-prices[buy];
                }
                if (profit> maxprofit){
                   maxprofit = profit;
                 }
                
            }
            
        }
     
        return maxprofit;
        
        
    }
}


// by using optimal solution
class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for (int i =0;i<prices.length;i++){
            if (prices[i]< minPrice){
            minPrice = prices[i];
                
        } else if (prices[i] - minPrice> maxprofit){
                maxprofit = prices[i] - minPrice;
            }
        
        
    }
        return maxprofit;
}
}