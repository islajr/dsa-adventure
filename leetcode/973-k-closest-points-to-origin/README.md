# LC 973: [K Closest Points to Origin]


> **Date:** [2026-10-15]

> **Description:** [LC 973](https://leetcode.com/problems/k-closest-points-to-origin/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Priority Queue|Priority Queues]]

## Approach

### [Min Heap]

> **Time Complexity:** $O(n + k \log n)$

> **Space Complexity:** $O(n)$

We are given a 2D matrix with each value representing a pair of co-ordinates on a graph. We are to find the ***k-closest*** points to the origin `(0, 0)` and return them in a list.

One way to go about this is with a **min heap**. To do this, we compute the distance of each point from the origin and use that as the priority within the heap. This way, the closest points will be at the top. As such, if we remove from the heap *k* times, we find the *k closest* elements to the origin of the graph.

``` python
def kClosest(points: List[List[int]], k: int) -> List[List[int]]:
	minHeap = []
	for x, y in points:
		distance = (x ** 2) + (y ** 2)
		minHeap.append([distance, x, y])
	heapq.heapify(minHeap)
	
	res = []
	while k > 0:
		dist, x, y = heapq.heappop(minHeap)
		res.append([x, y])
		k -= 1
	return res
```
---
### [Max Heap]

> **Time Complexity:** $O(n * \log k)$

> **Space Complexity:** $O(k)$

Similar to the Min Heap solution is the Max Heap solution. We need the *k closest* elements from the list of **points**, and by using a max heap, we store every element we find with a caveat -- when the length of the heap has exceeded `k`, we remove the root element (the largest) which is the farthest distance from the origin and insert a new one. 

Given the fact that we continuously use `heapq.heappush()`, we are sure that the heap is consistently arranged in the way we expect. Once we run through `points`, we now have the *k closest elements* represented within our heap.

From this point on, we can simply extract the values, append them to a list and return said list.

``` python
def kClosest(points: List[List[int]], k: int) -> List[List[int]]:
	maxHeap = []
	for x, y in points:
		distance = -(x ** 2 + y ** 2)
		heapq.heappush(maxHeap, [distance, x, y])
		if len(maxHeap > k):
			heapq.heappop(maxHeap)
	
	res = []
	while maxHeap:
		distance, x, y = heapq.heeappop(maxHeap)
		res.append([x, y])
	return res
```

---
*Tags: #dsa #leetcode #priority-queue*
