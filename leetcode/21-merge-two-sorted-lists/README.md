# LC 21: [Merge Two Sorted Lists]


> **Date:** [2026-09-30]

> **Description:** [LC 21](https://leetcode.com/problems/merge-two-sorted-lists/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Linked Lists|Linked Lists]]

## Approach

### [Iteration]

> **Time Complexity:** $O(m+n)$

> **Space Complexity:** $O(1)$  

The main approach to this is to iterate through both lists in one pass. We instantiate a new empty node and a dummy node pointing to the empty node and start by checking for the smaller value between both of our given lists. If this case is met, we simply point the `next()` method to the required node and then move the current pointer for the list forward. After each iteration, we are sure to move the `node.next()` pointer forward too. 

In order to cater for situations where both lists are not the same length, after the loop runs, we run this check and append any extra list nodes to the final `node.next()`. We then return the `next()` value of our previously instantiated dummy node.

``` python
def mergeTwoLists(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
	dummy = node = ListNode()
	
	while list1 and list2:
		if list1.val < list2.val:
			node.next = list1
			list1 = list1.next
		else:
			node.next = list2
			list2 = list2.next
		
		node = node.next
	node.next = list1 or list2
	return dummy.next
	
```

---
*Tags: #dsa #leetcode #linked-lists
