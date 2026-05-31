# LC 46: [Permutations]


> **Date:** [2026-05-28]
> **Description:** [LC 46](https://leetcode.com/problems/permutations/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Recursion]

> **Time Complexity:** O(n!∗n2)O(n!∗n2)
> **Space Complexity:**  O(n!∗n) for the output list.

The aim of the problem is to find al unique permutations for a given array`nums`.

Going about this via recursion involves building new permutations from smaller ones. The recursive case is front run, and the logic is as follows:

For every element in the list, all possible positions are established, inserted where appropriate, and copied into the resulting array. When the array is empty, the base case is triggered and the algorithm grinds to a halt.

``` python
def permute(nums: List[int]) -> List[List[int]]:
	if len(nums) == 0:
		return [[]]
	
	# front-running the recursive case
	perms = permute(nums[1:])
	res = []
	
	# nested loop to scramble all possible positions per element
	for p in perms:
		for i in range(len(p) + 1):
			p_copy = p.copy()
			p_copy.insert(i, nums[0])
			res.append(p_copy)
	
	return res
```

---

### [Backtracking]

> **Time Complexity:** O(n!∗n)
> **Space Complexity:** O(n!∗n) for the output list.

This problem can also be solved by backtracking. For this solution, we maintain two other lists along with `nums`: 
- `perms` to track the current permutations
- `pick` to track whether an element at a given index has been utilized in the permutation
Depending on whether the element at the current position has been used in the permutation, we either append it to the current permutation, mark it as **used** and continue, or we remove it from `perms` and mark it as **unused** -- hence the backtrack operation.



``` python
def permute(nums: List[int]) -> List[List[int]]:
	res = []
	backtrack([], nums, [False] * len(nums))
	return res
	
	# backtrack
	def backtrack(perms: List[int], nums: List[int], pick: List[bool]):
		if len(perm) == len(nums):
			res.append(perms[:])
			return
		
		for i in range(len(nums)):
			if not pick[i]:
				perm.append(i)
				pick[i] = True
				backtrack(perms, nums, pick)    # forward step
				perms.pop()
				pick[i] = False    # backtrack step
```


---
*Tags: #dsa #leetcode #backtracking
