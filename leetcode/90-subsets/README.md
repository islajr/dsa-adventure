# LC 90: [Subsets II]


> **Date:** [2026-06-04]
> **Description:** [LC 90 ](https://leetcode.com/problems/subsets-ii/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]]

## Approach

### [Backtracking I]

> **Time Complexity:** O(n * 2^n)
> **Space Complexity:**  O(n) extra space; O(2^n) space for output list

In generating subsets of a provided array where duplicate values are strictly forbidden, we are presented with two decisions, as always, at every branch of the decision tree while traversing the array:
- select the element
- deselect the element
One problem that may not be immediately obvious is the possibility of duplicate values. This means that the array should be sorted initially before anything else in order to facilitate the idea of stepping past duplicate values.

``` python
def combination_sum_ii(nums: List[int]) -> List[List[int]]:
	res = []
	nums.sort()
	
	def backtrack(index, subset):
		if i == len(nums):
			res.append(subset[::])
			return
		
		# select element
		subset.append(nums[i])
		backtrack(i + 1, subset)
		
		# de-select element
		subset.pop()
		
		# take care of duplicates
		while i + 1 < len(nums) and nums[i] == nums[i + 1]:
			i += 1
			backtrack(i + 1, subset)
	
	backtrack(0, [])
	return res

```

---
*Tags: #dsa #leetcode #backtracking
