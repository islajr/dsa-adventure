# LC 78: Subsets


> ***Date:** 2026-05-28*
> ***Description:** [LC 78](https://leetcode.com/problems/subsets/description/)*
> ***Difficulty:** Medium*
> ***Category:** [[Backtracking]]*

## Approach

### Backtracking

> ***Time Complexity:***    O(n * 2 ^ n)
> ***Space Complexity:***  O(n) extra space | O(2 ^ n) for the output list

Since the problem involves returning all possible subsets of `nums`, a viable solution would be to traverse the array until we find all possible subsets. In doing this, we go from element to element, and at each element, we have two options:

a) include the element
b) exclude the element

In order to explore both options, we employ backtracking recursively. Once the array completes one lap, it represents the end of a possible subset, and is duly appended to the result array.

``` python
def subsets(nums: List[int]) -> List[List[int]]:
	res = []
	subset = []
	
	def dfs(int i):
		# base case
		if i >= len(nums):
			res.append(subset.copy())    # copy current subset
			return
		subset.append(i)
		dfs(i + 1)    # decision branch 1
		
		subset.pop()
		dfs(i + 1)    # decision branch 2
	
	dfs(0)
	return res
```

---
*Tags: #dsa #leetcode
