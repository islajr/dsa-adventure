# LC 703: [Kth Largest Element in a Stream]


> **Date:** [2026-07-18]

> **Description:** [LC 703](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Priority Queue|Priority Queue]]

## Approach

### [Sorting]

> **Time Complexity:** $O(m*nlogn)$

> **Space Complexity:** $O(m)$ | $O(1)$ or $O(n)$ depending on sorting algorithm

Similar to [[LC 215 - Kth Largest Element in an Array|LC 215]], this problem mandates the creation of a class to find the `kth` largest integer in a stream of values including duplicates. This approach makes it trivial, but depends hugely on the sorting algorithm. We are required to populate two methods: `__init__()` and `add()`. These two are trivial. For `__init__()`, we simply create two instance variables: `k` and `arr` to hold both the value and array we're working with respectively.

For the `add()` method, whenever it is called, we simply append the value to the array from earlier, sort it, and then index it from the rear as in [[LC 215 - Kth Largest Element in an Array|LC 215]].


``` python
class KthLarget:
	def __init__(self, k: int, nums: List[int]):
		self.k = k
		self.arr = nums
	
	def add(self, val: int) -> int:
		self.arr.add(val)
		self.arr.sort()
		return self.arr[len(self.arr) - self.k]
```

---

### [Heap]

> **Time Complexity:** $O(m * \log k)$

> **Space Complexity:** $O(k)$

The sorting approach is good, and works well, but this problem is a good one via which to introduce the idea of heaps. Since it requires us to return the **kth largest element** in a stream, we do not need to store every number provided in `nums`. We can simply store the k-largest elements within a min heap, with the kth largest element being the root node. Whenever the size of the heap exceeds `k`, we pop from it to ensure it stays within bounds. This way, we ensure better time and space complexity.

``` python
class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.minheap, self.k = nums, k
        heapq.heapify(self.minheap)
        while len(self.minheap) > k:
            heapq.heappop(self.minheap)

    def add(self, val: int) -> int:
        heapq.heappush(self.minheap, val)
        if len(self.minheap) > self.k:
            heapq.heappop(self.minheap)
        return self.minheap[0]
  
```

---
*Tags: #dsa #leetcode #priority-queue
