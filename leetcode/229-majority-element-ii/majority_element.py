# LC 229: Majority Element II

class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        nums.sort()
        res, n = [], len(nums)

        i = 0
        while i < n:
            j = i + 1
            while j < n and nums[i] == nums[j]:
                j += 1

            if (j - 1) > n // 3:
                res.append(nums[i])
            i = j

        return res
