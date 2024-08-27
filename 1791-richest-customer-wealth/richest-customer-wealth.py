class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans = float('-inf')
        for anint in accounts:
            cus_sum = sum(anint)
            if cus_sum > ans:
                ans = cus_sum
        return ans