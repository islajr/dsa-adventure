# LC 206: [Reverse Linked List]


> **Date:** [2026-09-16]

> **Description:** [LC 206](https://leetcode.com/problems/reverse-linked-list/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Linked Lists|Linked Lists]]

## Approach

### [Iterative Reversal]

> **Time Complexity:** $O(n)$

> **Space Complexity:** $O(1)$

To reverse a linked list, we need to come to terms with the general architecture of the data structure, which is that it possesses a value and a pointer to the next value. This problem specifically asks to reverse a singly linked list in-place, given the `head`.

To go about this, we initialize two variables: `prev` and `curr` to hold the previous and current values. These values are initialized to `null` and `head` initially. Then, within a loop that exists whenever `curr = null`, we store the current next value in `temp`. Then we point the `.next()` attribute backwards to `prev`. After this, we move forward by assigning the current value to `prev` and the next value which we previously stored in `temp` to `curr`. The final value will end up being stored in `prev`, as `curr` will point towards a null value.

This approach seeems mechanical, but it works, and is widely regarded as **the** way to reverse a singly-linked list in place. 


``` python
def reverseList(head: ListNode | None) -> ListNode | None:
	prev, curr = None, head
	
	while curr:
		temp = curr.next
		curr.next = prev
		prev = curr
		curr = temp
	return prev
```

---
*Tags: #dsa #leetcode #linked-lists
