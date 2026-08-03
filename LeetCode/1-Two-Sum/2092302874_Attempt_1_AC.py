class Solution:
    def twoSum(self, nums, target):
        ui = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in ui:
                return [ui[complement], i]

            ui[num] = i