# LC 347: [Top K Frequent Elements]


> **Date:** [2026-07-12]
> **Description:** [LC 347 ](https://leetcode.com/problems/top-k-frequent-elements/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Arrays|Arrays]]

## Approach

### [Sorting]

> **Time Complexity:** O(n log n)
> **Space Complexity:**  O(n)

This problem says to return the top `k` frequent elements within a provided list `nums`. The first route to go is obviously `sorting`.  Here, a hash map is first used to track the frequency map of elements, after which we simply extract the result into a nested array, sort it, and obtain the final `k` frequent elements from the rear. 


``` python
def top_k_frequent_elements(nums: List[int], k: int) -> List[int]:
	count = {}
	for num in nums:
		count[num] = 1 + count.get(num, 0)
	
	arr = []
	for num, cnt in count.items():
		arr.append([cnt, num])
	arr.sort()
	
	res = []
	while len(arr) < k:
		res.append(arr.pop()[1])
	return res
```

---
*Tags: #dsa #leetcode #arrays
