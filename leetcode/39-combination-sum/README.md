# LC 39: [Combination Sum]


> ***Date:** [2026-05-28[*
> ***Description:** [LC 39](https://leetcode.com/problems/combination-sum/)*
> ***Difficulty:** [Medium[*
> ***Category:** [[algorithms#[Backtracking]]]*

## Approach

### [Backtracking]

> ***Time Complexity:***    O(2^(t/m))
> ***Space Complexity:***   O(t/m)

This problem is all about finding all possible combinations of element of a list `candidates` that add up to a target value `target`. The problem's constraints allow repition of values, but enforces uniqueness of combinations.

In order to do this, we need to define an array to hold the result: `res`, and a method to traverse the original array: `candidates`.

In traversing the array, there are two branches of the decision tree:
a) add current element and remain at that index as that element could be re-used
b) backtrack by removing element and proceeding

At each  branch of the tree, appropriate changes are made to the `curr`  array that holds the components of a **combination**. Base cases are also defined for when a target is acheived and when limits are reached. 



``` python
def combination_sum(List[int] candidates, int target) -> List[List[int]]:
	res = []
	
	def dfs(i, curr, total):
		# base case i
		if total == target:
			res.append(curr.copy())
			return
		
		# base case ii
		if i >= len(candidates) or total > target:
			return 
		
		# decision branch i: add current element and remain at index
		curr.append(candidates[i])
		dfs(i, curr, total + candidates[i])
		
		# decision branch ii: remove element and proceed
		curr.pop()
		dfs(i + 1, curr, total)
		
	
	dfs(0, [], 0)
	return res
```

---
*Tags: #dsa #leetcode
