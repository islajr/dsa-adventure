# LC 26: Remove Duplicates from Sorted Array
class Solution:
    def remove_duplicates(self, nums: List[int]) -> int:
        unique = sorted(set(nums))
        nums[:len(unique)] = unique
        return len(unique)
