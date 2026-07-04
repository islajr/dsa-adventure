# LC 128: [Longest Consecutive Sequence]


> **Date:** [2026-07-04]
> **Description:** [LC 128](https://leetcode.com/problems/longest-consecutive-sequence/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Arrays]]

## Approach

### [Sorting]

> **Time Complexity:** O(n log n)
> **Space Complexity:**  O(1)

This problem has to do with finding the longest consecutive sequence of numbers in a provided arrays. With this approach, we sort the array in ascending order first as long as the array has been confirmed not to be empty. Then we set a counter for iterating, for streaks, and to track the current number of the array, and as long as the counter is still within the bounds of the array, we continue. 

First thing to look for is mismatches. This would suggest that the sequence has been broken and as such, we update our current index tracker to the current index of the array and then reset the streak.

Duplicates are a reasonable edge case to handle, and we do that properly by creating a nested loop that increments the iterating counter whenever we find  a match. 

Finally, the streak value and current indexes are updated and the result variable is also updated.

``` python
def lcs(nums: List[int]) -> int:
	if not nums:
		return 0
	res, i = 0, 0
	nums.sort()
	curr, streak = nums[0], 0
	while i < len(nums):
		if curr != nums[i]:
			curr = nums[i]
			streak = 0
		while i < len(nums) and nums[i] == curr:
			i += 1
		streak += 1
		curr += 1
		res = max(res, streak)
	return res
```

---
*Tags: #dsa #leetcode #arrays 
