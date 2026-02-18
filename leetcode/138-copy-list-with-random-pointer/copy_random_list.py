"""
LC 138: Copy List with Random Pointer

A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.
"""
class Solution:
    """
        # Definition for a Node.
        class Node:
        def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
            self.val = int(x)
            self.next = next
            self.random = random
    """
    
    def copy_random_list(self, head: 'Optional[Node]') -> 'OptionalNode':
        old = {None: None}

        curr = head
        while curr:
            copy = Node(curr.val)
            old[curr] = copy
            curr = curr.next
        
        curr = head
        while curr:
            copy = old[curr]
            copy.next = old[curr.next]
            copy.random = old[curr.random]
            curr = curr.next
        return old[head]
