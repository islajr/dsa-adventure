# LC 704: [Binary Search]


> **Date:** [2026-09-16]

> **Description:** [LC 704](https://leetcode.com/problems/binary-search/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Binary Search]

> **Time Complexity:** $O(log n)$

> **Space Complexity:** $O(1)$

This problem is classic binary search. Given a sorted list of numbers `nums`, write an algorithm that finds a number `target`. Return the index of `target` or -1. The algorithm must also run in $O(\log n)$ time. 

To achieve this, we use the classic binary search feature that finds the midpoint and limits the search size of the array depending on whether the midpoint is greater or lesser than the target number.

``` python
def search(nums: List[int], target: int) -> int:
	l, r = 0, len(nums) - 1
	while l <= r:
		m = (l + r) // 2
		if target < nums[m]:
			r = m - 1
		elif target > nums[m]:
			l = m + 1
		else:
			return m
	return -1
```

---
*Tags: #dsa #leetcode #binary-search
