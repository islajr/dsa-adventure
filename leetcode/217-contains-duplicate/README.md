# LC 217: [Contains Duplicate]


> **Date:** [2026-06-26]
> **Description:** [LC 217](https://leetcode.com/problems/contains-duplicate/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Arrays]]

## Approach

### [Hash Set]

> **Time Complexity:**
> **Space Complexity:**  

The description of this provblem says to return `true` if any value appears more than once within the array.
Tackling this is almost trivial. We could use a hash set to store all unique values of the array while looping through it. For every element, we check for its presence within the set and proceed only if that is confirmed false. 
On event that is is true, we return `true` immediately.

``` python
def contains_duplicate(nums: List[int]) -> bool:
	nums_set = set()
	for num in nums:
		if num in nums_set:
			return True
		nums_set.add(nums)
	
	return false
```

---
*Tags: #dsa #leetcode #arrays
