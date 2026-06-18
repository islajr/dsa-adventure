# LC 131: [Palindrome Partitioning]


> **Date:** [2026-06-18]
> **Description:** [LC 131](https://leetcode.com/problems/palindrome-partitioning/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking I]

> **Time Complexity:** O(n  2^n)
> **Space Complexity:**  O(n) extra space

We can think about the problem like making "cuts" in the provided string `s`. At each point, depending on whether the current substring is a palindrome, we can either decide to extend both ends of the substring and continue our search, or to select the current one and move on by incrementing onlty the far edge.

The base case will be if and when the right bound becomes unbounded, in which case we offload `part` into `res`.

For this solution, we simply start with some version of the [[Sliding WIndow]] technique by maintaining a substring at all times and then recursively searching for valid palindromic partitions. 

If we find one, we can add it to an array and choose to either extend the window, or to start entirely from a new point.

``` python
def partition(s: str) -> List[List[str]]:
	res, part = [], []
	
	def dfs(j, i):
		# base case
		if i >= len(s):
			if i == j:
				res.append(part.copy())
			return
		
		if is_palindrome(s, j, i):
			# forward case
			part.append(s[j : i+1])
			dfs(j + 1, i + 1)
			
			# backtrack case
			part.pop()
			
		# eitherway...
		dfs(j, i + 1)
	
	dfs(0, 0)
	return res
	
def is_palindrome(s, l, r):
	while l < r:
		if s[l] != s[r]:
			return False
		l, r = l + 1, r - 1
	return True
			
```

---
*Tags: #dsa #leetcode #backtracking 
