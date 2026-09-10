# LC 11: [Container With Most Water]


> **Date:** [2026-09-10]

> **Description:** [LC 11](https://leetcode.com/problems/container-with-most-water/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Two Pointer|Two Pointers]]

## Approach

### [Two Pointers]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(1)$

This problem provides an array `heights` consisting of container heights and requires us to find the container that holds the most water. This is a good two pointer problem with a twist. Obviously, we can't sort the array or that would ruin everything. We can set up the rest of the two-pointer approach by intializing our pointers at either end of the array before, at every combination point, computing the area `min(heights[i], heights[j]) * (j - i) ` and storing it if it is the highest one recorded.

The real nuance in this problem comes in in that since the array is not sorted, we do not know how to proceed. To solve this, we shift the pointer at the lowest height inward. This is because we are in search of the biggest possible area. Moving the higher point inwards sacrifices width for what is not guaranteed which leads to inefficient solutions.


``` python
def max_area(heights: List[int]) -> int:
	l, r = 0, len(heights) - 1
	res = 0
	
	while l < r:
		area = min(heights[l], heights[r]) * (r - l)
		res = max(res, area)
		if heights[l] < heights[r]:
			l += 1
		else:
			r -=1
	return res
```

---
*Tags: #dsa #leetcode #two-pointers
