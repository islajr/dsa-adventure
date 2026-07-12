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
*Tags: #dsa #leetcode #priority-queue
