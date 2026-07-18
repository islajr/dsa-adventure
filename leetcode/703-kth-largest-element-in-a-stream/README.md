# LC 703: [Kth Largest Element in a Stream]


> **Date:** [2026-07-18]
> **Description:** [LC 703](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Priority Queue|Priority Queue]]

## Approach

### [Sorting]

> **Time Complexity:** O(m * n log n)
> **Space Complexity:** O(m) extra space | O(1) or O(n) depending on sorting algorithm

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
*Tags: #dsa #leetcode #priority-queue
