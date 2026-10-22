class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int day=0;
        while(day<prices.length){
            if(prices[day]<minPrice){
                minPrice=prices[day];
            }
            maxProfit=Math.max(maxProfit,prices[day]-minPrice);
            day++;
        }
        return maxProfit;
    }
}