""" 
LC 658: Find K Closest Elements

Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b

"""
class Solution:
    def find_closest_elements(self, arr: List[int], x: int, k: int) -> List[int]:
        l, r = 0, len(arr) - k
        
        while l < r:
            m = (l + r) // 2
            
            if x - arr[m] > arr[m + k] - x:
                l = m + 1
            else:
                r = m
        return arr[l:l + k]