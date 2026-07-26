# LC 15: [3Sum]


> **Date:** [2026-07-26]
> **Description:** [LC 15](https://leetcode.com/problems/3sum/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#Two Pointers|Two Pointers]]

## Approach

### [Sorting]

> **Time Complexity:** O(n^2)
> **Space Complexity:**  O(1)

This problem is the logical progression of [[LC 1 - Two Sum]], but with a twist -- all numbers must add up to 0. This simply means that in this case, 0 is the `target`. Due to the odd nature of the expected number count, a normal two pointer approach would not work. we would need to fix a variable and then use the two pointer to iterate through the array `nums`.

First, we start by sorting the array. This adds a bit of time complexity overhead (depending on the sorting algorithm) but makes things drastically easy by:
- ensuring that we do not waste time and compute going down pointless branches
- helping us identify and skip duplicates easily
  
For every valid element `a`, we try to find any two other elements that both add up to the target 0.
From there on, the rest of the implementation is trivial, save for the final part where we skip duplicates at the left pointer before incrementing the index.

``` python
def three_sum(nums: List[int]) -> List[List[int]]:
	nums.sort()
	res = []
	
	for i, a in enumerate(nums):
		if a > 0: # path pruning
			break
		if i > 0 and a == nums[i - 1]: # handling duplicates
			continue
		
		l, r = i, len(nums) - 1
		while l < r:
			inner_sum = a + nums[l] + nums[r]
			if inner_sum > 0:
				r -= 1
			elif inner_sum < 0:
				l += 1
			else:
				res.append([a, nums[l], nums[r]])
				l += 1
				r -= 1
				
				# skip all LHS duplicates
				while nums[l] == nums[l - 1] and l < r:
					l += 1
	return res
```

---
*Tags: #dsa #leetcode #two-pointers
