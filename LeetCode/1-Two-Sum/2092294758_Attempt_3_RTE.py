class Solution:
    def twoSum(self, nums, target):
        seen = {}

        for i, num in enumerate(nums):
            complement = target - num
asdsa
            if complement in seen:
                return [seen[complement], i]

            seen[num] = i