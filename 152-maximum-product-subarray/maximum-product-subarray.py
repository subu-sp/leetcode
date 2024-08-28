class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxi = nums[0]
        mini = nums[0]
        result = nums[0]
        for i in range(1, len(nums)):
            temp = maxi
            maxi = max(nums[i], max(nums[i]*maxi, nums[i]*mini))
            mini = min(nums[i], min(nums[i]*temp, nums[i]*mini))
            result = max(result, maxi)
        return result
        