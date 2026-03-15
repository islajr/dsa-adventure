""" 
LC 167: Two Sum II - Input Array Is Sorted
"""
class Solution:
    def two_sum(self, numbers: List[int], target: int) -> List[int]:
        left, right = 0, len(numbers) - 1
        
        while (left < right):
            if left + right == target:
                return [left + 1, right + 1]
            elif left + right < target:
                left += 1
            elif left + right > target:
                right -= 1
            
        return []