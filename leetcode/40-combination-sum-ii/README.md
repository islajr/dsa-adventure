# LC 40: [Combination Sum II]


> **Date:** [2026-06-04]
> **Description:** [LC 40 ](https://leetcode.com/problems/combination-sum-ii/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking]

> **Time Complexity:** O(n * 2^n)
> **Space Complexity:**  O(n) extra space; O(2^n) space for output list

This approach is similar in principle to what is employed in [[LC 40#[Backtracking]]. The problem is of a similar nature too: selecting numbers that add up to a `target` without duplicates within combinations.

There are two branches of the decision tree here:
- select the element
- skip the element
While skipping, it is best to skip all the duplicates in one jump. This can be achieved by sorting the array from the beginning so duplicates cluster together.

``` python
def combination_sum_ii(candidates: List[int], target: int) -> List[List[int]]:
	res = []
	candidates.sort()
	
	def dfs(i, curr, total):
		if total == target:
			res.append(curr.copy())
			return
		if total > target or i == len(candidates):
			return

		curr.append(candidates[i])
		dfs(i + 1, curr, total + candidates[i])
		curr.pop()

		while i + 1 < len(candidates) and candidates[i] == candidates[i + 1]:
		i += 1

		dfs(i + 1, curr, total)
	
	dfs(0, [], 0)
	return res
```

---
*Tags: #dsa #leetcode #backtracking
