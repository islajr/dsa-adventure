# LC 698: [Partition to K Equal Sum Subsets]


> **Date:** [2026-06-18]
> **Description:** [LC 698 ](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]

## Approach

### [Backtracking — Pruning]

> **Time Complexity:** O(k * 2^n)
> **Space Complexity:**  O(n)

The problem description provides us with an integer array `nums`, and a target number `k` of non-empty subsets into which the elements of `nums` can be divided into. It then tasks us with declaring if this task is possible or otherwise. 

The way to go about this is to exclude all possible/obvious failures. The first one is if the sum of `nums` is not divisible by `k`. In this case, we simply return **False**.

We can then sort the array in reverse order so as to fail quickly/faster when a large number cannot fit in to the subset.  We use floor division to find out our `target`, and set up a boolean array to track used and unsed indexes of `nums`.

Within the `backtrack()` method, our north start is if we have the required `k`. If so, we return `True`. The high-level recursive case for when we have formed a valid subset is to decrement k by 1.

The crux of the matter now, is to loop through `nums` and to find valid combinations. If the current index is used within this combination, or if it won't fit into the subset, we simply ignore it. 
The case to move forward is defined by simply recursively incrementing the loop counter: `j` and returning `True` where we can.
As for the backtrack case, we simply set the boolean flag for the index back to false.

What makes the solution efficient is the early termination or pruning of branches that are simply unfit, and the check is when `subet` still equals 0 after an iteration.

``` python
def can_partition(nums: List[int], k: int) -> bool:
	if sum(nums) % k != 0:
		return False
	
	# sort nums
	nums.sort(reverse=True)
	target = nums // k
	used = [False] * len(nums)
	
	def backtrack(i, k, subset):
		# base case
		if k == 0:
			return True
		
		# recursive case (i) — positive [forward L2]
		if subset == target:
			return backtrack(0, k - 1, 0)
		
		for j in range(i, len(nums)):
			# ignore if unusable
			if used[j] or nums[j] + subset > target:
				continue
			# recursive case (ii) — positive [forward L1]
			used[j] = True
			if backtrack(j + 1, k, subset + nums[j]):
				return True
			# backtrack case
			used[j] = False
			# pruning for large or unfit numbers
			if subset == 0:
				return False
		return False
		
	return backtrack(0, k, 0)
```

---
*Tags: #dsa #leetcode #backtracking 
