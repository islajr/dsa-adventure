# LC 215: [Kth Largest Element in an Array]


> **Date:** [2026-07-18]
> **Description:** [LC 215](https://leetcode.com/problems/kth-largest-element-in-an-array/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Arrays|Arrays]]

## Approach

### [Sorting]

> **Time Complexity:** O(n log n)
> **Space Complexity:**  O(1) or O(n) depending on the sorting algorithm

Given an array `nums`, the problem requires us to return the `kth` largest element. The most intuitive way to do this is to sort the array first in ascending order. After that, it becomes rather trivial, as it only requires appropriate indexing against the length of the array to find the the element exactly `k` indices away from the end.


``` python
def find_kth_largest(nums: List[int], k: int) -> int:
	nums.sort()
	return nums[len(nums) - k]
```

---
*Tags: #dsa #leetcode #arrays
