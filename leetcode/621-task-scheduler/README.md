# LC 621: [Task Scheduler]


> **Date:** [2026-08-16]
> **Description:** [LC 621](https://leetcode.com/problems/task-scheduler/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Priority Queue|Priority Queues]]

## Approach

### [Max Heap]

> **Time Complexity:** $O(\log n)$
> **Space Complexity:** $O(n)$

The problem here is to find the minimum interval required to run a list of tasks `tasks`, from which each element, after it is used, must idle for `n` times at intervals. This is a rather crafty problem, but with **max heaps**, it is almost trivial. An approach follows so:

We store the frequency of each character in `tasks` in a hashmap in preparation for heapifying the collection. We then define a queue to hold the remaining frequency tallies of each `tasks` element and their corresponding idle time. In each iteration, we select the highest remaining frequency, process it by updating the frequency, and pass it into the queue with it's idle time. After the idle time is elapsed, we simply add it back to the max heap with it's new frequency count.

``` python
def least_interval(tasks: List[str], n: int) -> int:
	count = Counter(tasks)
	maxHeap = [-cnt for cnt in count.values()]
	heapq.heapify(maxHeap)
	
	time = 0
	q = deque()
	
	while maxHeap or q:
		time += 1
		
		if maxHeap:
			cnt = 1 + heapq.heappop(maxHeap)
			
			if cnt:
				q.append([cnt, time + n])
		if q and q[0][1] == time:
			heapq.heappush(maxHeap, q.popleft()[0])
	return time
	
	
```

---
*Tags: #dsa #leetcode #priority-queue
