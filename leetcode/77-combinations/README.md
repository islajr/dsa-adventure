# LC 77: [Combinations]


> **Date:** [2026-05-31]
> **Description:** [LC 77 ](https://leetcode.com/problems/combinations/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking]

> **Time Complexity:**   `O(k∗n!(n−k)!∗k!)O(k∗(n−k)!∗k!n!​)`
> **Space Complexity:**  `O(k∗(n−k)!∗k!n!​)` for the output array.

Combinations, unlike permutations, do not respect order. This means that the result of this problem can be returned in any order. As such, at every point, using backtracking, there are two decision branches:
- include the number
- exclude the number

The problem can be kickstarted by initializing the `backtrack` algorithm with an empty combination. At each point, we exercise one of the branches of the decision tree by either adding the number at the current index or skipping it entirely. 

For the base case, upon each recursive call, we check if the current index exceeds the maximum `n` allowed. If so, we check if the current combination has exactly `k` characters and append a copy to the `res` array if so.

``` python
def combine(n: int, k: int):
	res = []
	
	def backtrack(i: int, comb: List[]):
		if i > n:
			if len(comb) == k:
				res.append(comb.copy())
				return
			
			# progressive case
			comb.append(num[i])
			backtrack(i + 1, comb)
			
			# backtrack case
			comb.pop()
			backtrack(i + 1, comb)
	
	backtrack(i, [])
	return res
```

---
*Tags: #dsa #leetcode #backtracking 
