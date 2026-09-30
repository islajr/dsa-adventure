# LC 141: [Linked List Cycle]


> **Date:** [2026-09-30]

> **Description:** [LC 141](https://leetcode.com/problems/linked-list-cycle/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Linked Lists|Linked Lists]]

## Approach

### [Hash Set]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(n)$

In order to detect cycles, a good way to go would be to use a hash set to store each node in the linked list. At every point, we check if said node is within the set, returning `true` if so and `false` at the end as a default response. It is also important not to forget to move the pointer forward too.

``` python
def hasCycle(head: Optional[ListNode]) -> bool:
	curr = head
	seen = set()
	
	while curr:
		if curr in seen:
			return True
		seen.add(curr)
		curr = curr.next
	return False
```

---
### [Fast and Slow Pointers]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(1)$

This idea improves upon the extra space used by the [[LC 141 - Linked List Cycle#[Hash Set|HashsetApproach]], cutting it down to constant time. It uses two pointers -- one fast, one slow -- with `fast` moving twice as fast and `slow` moving normally. The idea behind it is that if there is really a cycle within the list, at some point, both pointers will meet. It is important to ensure to look ahead one step with the fast pointer as the condition to start/continue the loop so as not to encounter errors and null values.

``` python
def hasCycle(head: Optional[ListNode]) -> bool:
	fast, slow = head, head
	while fast and fast.next:
		slow = slow.next
		fast = fast.next.next
		
		if slow == fast:
			return True
	return False
```

---
*Tags: #dsa #leetcode #linked-lists 
