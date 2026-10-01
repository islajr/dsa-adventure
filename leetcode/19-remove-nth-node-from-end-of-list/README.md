# LC 19: [Remove Nth Node From End of List]


> **Date:** [2026-10-01]
>
> **Description:** [LC 19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
>
> **Difficulty:** [Medium]
>
> **Category:** [[dsa-concepts#[Linked Lists|Linked Lists]]

## Approach

### [Iterative Two Pass]

> **Time Complexity:** $O(n)$
>
> **Space Complexity:** $O(1)$

An intuitive approach would be to learn the length of the linked list first with one pass, after which we proceed to compute the index to remove as `length - n`. If this happens to be zero, we simply return `head.next()` and call it a day. Otherwise, we use a loop to traverse the linked list a second time, stopping just before the index to be removed. Once this condition is met, we simply connect the `.next()` value of the preceding node to that of the subsequent one, effectively bypassing the node to be removed. Once we do this, we can terminate the loop and return `head` as required.

``` python
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr, length = head, 0
        while curr:
            length += 1
            curr = curr.next
        
        remove_index = length - n
        if remove_index == 0:
            return head.next
        
        curr = head
        for i in range(length - 1):
            if i + 1 == remove_index:
                curr.next = curr.next.next
                break
            curr = curr.next
        return head
        
```

---
Tags: #dsa #leetcode #linked-lists
