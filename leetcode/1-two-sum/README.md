# LC 1: [Two Sum]


> **Date:** [2026-06-27]
> **Description:** [LC 1](https://leetcode.com/problems/two-sum/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Arrays]]

## Approach

### [Brute Force]

> **Time Complexity:** O(n ^ 2)
> **Space Complexity:**  O(1)

A good place to start at any problem is to brute-force it. We are in search of the indexes of the array element that add up to a specific `target` value. 

We could simply use two loops: one as the main loop, and the other to search for the second element relative to the current one.
Checks are simple. We return the two indices if they equal the target, or an empty list if it doesn't exist.


``` python
def two_sum(nums: List[int], target: int) -> List[int]:
	for i in range(len(nums)):
		for j in range(i + 1, len(nums)):
			if target == nums[i] + nums[j]:
				return [i, j]
	return []
```

---

### [Sorting]

> **Time Complexity:** O(n log n)
> **Space Complexity:** O(n)

The previous [[LC 1 - Two Sum#[Brute Force]|approach]] was too inefficient, because the time complexity was exponential. 
We can improve on it by sorting the initial array and then using a two-pointer approach. Two pointers: `i` and `j` at the beginning and end of the array. We then loop through, checking if the combinations equal the `target`. If lower, we incremement `i`. If higher, we decrement `j`, and once equal, we return both indices.

``` python
def two_sum(nums: List[int], target: int) -> List[int]:
	A = []
	for i, num in enumerate(nums):
		A.append([i, num])
	
	i, j = 0, len(nums) - 1
	while i < j:
	curr = A[i][1] + A[j][1]
	if curr < target:
		i += 1
	elif curr > target:
		j -= 1
	else:
		return [min(A[i][0], A[j][0]), max(A[i][0], A[j][0])] 
	
	return []
```

---
*Tags: #dsa #leetcode #arrays
