# LC 219: [Contains Duplicate II]


> **Date:** [2026-08-13]
> **Description:** [LC 219](https://leetcode.com/problems/contains-duplicate-ii/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Sliding Window|Sliding Window]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(n*min(n, k))$
> **Space Complexity:** $O(1)$


The simplest approach to this problem is to compute every possible combination -- The classic *brute force* method. To do this, we simply need to understand the question, which is to return `true` if there are two distinct indices representing the same number, and they are at least `k` elements apart. This constraint is detailed with the expression `abs(i - j) <= k`.

To do this, we simply set aside two loops, one that traverses the remainder of `nums` for every instance of the other, checking for at minimum, within the distance `k` or the end of the loop. When this constraint is satisfied, we simply check if they are equal and return `true`. Otherwise, the program continues until these conditions are met. If this never happens, it simply returns `false`.

``` python
def contains_nearby_duplicate(nums: List[int], k: int) -> bool:
	for i in range(len(nums)):
		for j in range(i + 1, min(len(nums), i + k + 1)):
			if nums[i] == nums[j]:
				return True
	return False
```

---
### [Hash Map]

> **Time Complexity:** $O(n)$
> **Space Complexity:** $O(n)$

As opposed to simply traversing the array endlessly, we can store both the number and it's index as key-value pairs in a hash-map for $O(1)$ lookups. Once we do this, we're sure to only traverse the loop **once**. Upon every number, we simply check if it exists within the hashmap and whether it is a nearby duplicate -- `i - index <= k`. If so, we return `True`. If it doesn't exist, we simply add it. If none of our conditions are met, we simply return `False`.

``` python
def contains_nearby_duplicate(nums: List[int], k: int) -> bool:
	counter = {}
	for i in range(len(nums)):
		if nums[i] in counter and i - counter[nums[i]] <= k:
			return True
		counter[nums[i]] = i
	return False
```

---
*Tags: #dsa #leetcode #sliding-window 
