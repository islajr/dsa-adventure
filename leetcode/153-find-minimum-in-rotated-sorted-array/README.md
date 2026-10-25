# LC 153: [Find Minimum in Rotated Sorted Array]


> **Date:** [2026-10-25]
>
> **Description:** [LC 153](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/)
>
> **Difficulty:** [Medium]
>
> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(n)$
>
> **Space Complexity:** $O(1)$

A rotated array is still an array, and finding the minimum element in an array via brute force is simply a method of tracking the lowest element seen thus far in the array.


``` python
def findMin(nums: List[int]) -> int:
	return min(nums)
```
---
### [Binary Search]

> **Time Complexity:** $O(\log n)$
>
> **Space Complexity:** $O(1)$

A rotated array has **one** key property: one part is always sorted, while the other contains the rotated part, and resultantly, the minimum element. This means that we can use binary search to identify which part is sorted.

If the left part is sorted, the minimum element cannot be located there, hence we search the right. If the right part is sorted, the minimum has to either be in the left part or the midpoint.

In order to solve this efficiently, we first check if the entire array is correctly sorted. If so, we update and return the result. Otherwise, we compute the middle value, update the result if `middle value < result`, and get into the algorithm proper, halving our range of values to achieve logarithmic time.

 ``` python
 def findMin(nums: List[int]) -> int:
	 res = nums[0]
	 l, r = 0, len(nums) - 1
	 
	 while l <= r:
		 if nums[l] < nums[r]:
			 res = min(res, nums[l])
			 break
			 
		m = (l + r) // 2
		res = min(res, nums[m])
		if nums[m] >= nums[l]:
			l = m + 1
		else:
			r = m - 1
	return res
 ```


*Tags: #dsa #leetcode #binary-search*
