# LC 215: [Kth Largest Element in an Array]


> **Date:** [2026-07-18]

> **Description:** [LC 215](https://leetcode.com/problems/kth-largest-element-in-an-array/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Arrays|Arrays]]

## Approach

### [Sorting]

> **Time Complexity:** $O(n log n)$

> **Space Complexity:**  $O(n)$

Given an array `nums`, the problem requires us to return the `kth` largest element. The most intuitive way to do this is to sort the array first in ascending order. After that, it becomes rather trivial, as it only requires appropriate indexing against the length of the array to find the the element exactly `k` indices away from the end.


``` python
def find_kth_largest(nums: List[int], k: int) -> int:
	nums.sort()
	return nums[len(nums) - k]
```
---
### [Min Heap]

> **Time Complexity:** $O(n \log k)$

> **Space Complexity:** $O(n)$

Another way to go about this is to use a **min heap**. The rationale behind this is not particularly straightforward, but very appreciable. We store everything we find in the list `nums` within a heap right up until we hit the number `k` -- then we start to pop from the heap. Due to the fact that it is a minimum heap, it naturally expels the smallest numbers first, up until we get to the end end of the list `nums`. At this point, exactly the *k largest* numbers are contained within this heap.

Right after this operation, we simply pop from the heap again and what comes out is sure to be the *kth largest* number within the original list.

``` python
def findKthLargest(nums: List[int], k: int) -> int:
	minHeap = []
	for num in nums:
		heapq.heappush(minHeap, num)
		if len(minHeap) > k:
			heapq.heappop(minHeap)
	
	return heapq.heappop(minHeap)
```

---
*Tags: #dsa #leetcode #arrays*
