# LC 19: Remove Nth Node From End of List

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
        
