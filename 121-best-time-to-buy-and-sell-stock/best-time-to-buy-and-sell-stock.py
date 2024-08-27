class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxpro = 0
        minsofar = prices[0]
        for i in range(len(prices)):
            minsofar = min(minsofar, prices[i])
            profit = prices[i] - minsofar
            maxpro = max(maxpro, profit)
        return maxpro
        