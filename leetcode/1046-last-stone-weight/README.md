# LC 1046: [Last Stone Weight]


> **Date:** [2026-07-12]
> **Description:** [LC 1046 ](https://leetcode.com/problems/last-stone-weight/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Priority Queue|Priority Queue]]

## Approach

### [Sorting]

> **Time Complexity:** O(n^2 log n)
> **Space Complexity:**  O(1) or O(n) -- depending on the sorting algorithm

This problem involves smashing the given `stones` against each other from heaviest to lightest and keeping the difference. This approach should involve sorting the array in increasing order and then **popping** from one end twice to obtain the difference before inserting that into the array and sorting again. This is trivial

``` python
def last_stone_weight(stones: List[int]) -> int:
	while (len(stones) > 1):
		stones.sort()
		curr = stones.pop() - stones.pop()
		
		if curr:
			stones.append(curr)
		
		return stones[0] if stones else 0
```

---

## Approach
### [Heap]

> **Time Complexity:** O(n log n)
> **Space Complexity:** O(n) 

Given that we need to remove the **two heaviest stones**, this is a problem perfectly suited for a **max heap**. However, since most languges provide min heaps instead, a common trick is to use negative values and invert the logic, which makes the smallest value technically the largest.

The process to solving this problem would involve converting all stones to negative values and building a heap. Then we repeatedly pop the two smallest (heaviest) stones and smash them together. If equal, they're both destroyed. Otherwise, the difference is added to the heap. 

When either `1` or `0` stones remain, we return the remaining weight or 0 respectively.

``` python
def last_stone_weight(stones: List[int]) -> int:
	stones = [-s for s in stones]
	heapq.heapify(stones)
	
	while len(stones) > 1:
		first = heapq.heappop(stones)
		second = heapq.heappop(stones)
		
		if second > first:
			heapq.heappush(stones, first - second)
		
		stones.append(0)
		return abs(stones[0])
```

---
*Tags: #dsa #leetcode #priority-queue
