class Solution {
    public int maxProfit(int[] prices) {
        int maxpro = 0;
        int minsofar = prices[0];
        for (int ele : prices){
            minsofar = Math.min(minsofar, ele);
            int profit = ele - minsofar ;
            maxpro = Math.max(profit, maxpro);
        }
        return maxpro;

    }
}