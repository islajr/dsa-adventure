"""
You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.

"""
class Solution:
    # Definition for singly-linked list.
    # class ListNode:
    #     def __init__(self, val=0, next=None):
    #         self.val = val
    #         self.next = next
    def reverse(self, head):
        prev, curr = None, head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        return prev

    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # first pass to reverse list
        head = self.reverse(head)

        # drop lower values
        temp_head = head
        maximum = temp_head.val

        while temp_head.next:
            if temp_head.next.val >= maximum:
                maximum = temp_head.next.val
                temp_head = temp_head.next
            else: 
                temp_head.next = temp_head.next.next
        
        # reverse list again
        return self.reverse(head)

        