class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum = float('-inf')
        curr_sum = 0
        for i in range(0, len(nums)):
            curr_sum += nums[i]
            maxsum = max(maxsum, curr_sum)
            if curr_sum < 0:
                curr_sum = 0
        return maxsum
        