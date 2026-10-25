# LC 33: [Search in Rotated Sorted Array]


> **Date:** [2026-10-25]
>
> **Description:** [LC 33](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)
>
> **Difficulty:** [Medium]
>
> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(n)$
>
> **Space Complexity:** $O(1)$

Given that we're essentially looking for an element `target` within an array (rotated or no), we can find it by means of a simple brute force as seen below.

``` python
def search(nums: List[int], target: int) -> int:
	for i in range(len(nums)):
		if nums[i] == target:
			return i
	return -1
```

---

### [Binary Search]

> **Time Complexity:** $O(\log n)$
>
> **Space Complexity:** $O(1)$

While the brute force method works, it is linear and can get pretty slow for large arrays. There is a way to solve this in logarithmic time and the key insight is seeing the rotated array as two conjoined sorted arrays. The first step would be to find the point of rotation. We can do this via a **binary search**. To do this, we compute a midpoint value and compare it to the rightmost element. If it is found to be greater, that means the pivot element is in the right side. We adjust the left bound accordingly. Otherwise, we adjust the right bound accordingly also. 

Then we perform a binary search on each part in order to locate the `target` and return `-1` if the target not found within the array

``` python
def search(nums: List[int], target: int) -> int:
	l, r = 0, len(nums) - 1
	
	while l < r:
		m = (l + r) // 2
		if nums[m] > nums[r]:
			l = m + 1
		else:
			r = m
	pivot = l
	
	def binary_search(left: int, right: int) -> int:
		while left <= right:
			mid = (left + right) // 2
			if nums[mid] == target:
				return mid
			elif nums[mid] < target:
				left = mid + 1
			else:
				right = mid - 1
		return -1
	
	result = binary_search(0, pivot - 1)
	if result != -1:
		return result
	return binary_search(pivot, len(nums) - 1)
	
```

*Tags: #dsa #leetcode #binary-search*
