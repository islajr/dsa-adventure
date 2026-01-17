def sortArray(self, nums: List[int]) -> List[int]:
    if len(nums) < 2:
        return nums
    else:
        pivot = nums[0]
        lesser = [i for i in nums[1:] if i <= pivot]
        greater = [i for i in nums[1:] if i > pivot]
        
        return sortArray(sortArray(lesser) + sortArray([pivot]) + sortArray(greater))
    