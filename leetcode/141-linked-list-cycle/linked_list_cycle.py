""" 
LC 141: Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
"""
class Solution:
    def has_cycle(self, head: Optional[ListNode]) -> bool:
        slow, fast = head, head
        
        while fast and fast.next:
            slow = slow.next    # inch the slow pointer forward once step
            fast = fast.next.next   # inch the fast pointer forward two steps
            
            if slow == fast:    # if they ever meet
                return True
        
        return False