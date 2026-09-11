# LC 155: [Min Stack]


> **Date:** [2026-09-11]

> **Description:** [LC 155](https://leetcode.com/problems/min-stack/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#Stack|Stack]]

## Approach

### [Two Stacks]

> **Time Complexity:** $O(1)$

> **Space Complexity:** $O(n)$

This problem requires us to create a stack data structure with the constraint that there must be a `min()` method that returns the minimum element in the stack and runs in $O(1)$ time. This means that we simply can't cycle through the stack when we need something as that would be too inefficient. To battle this, we create two stacks: one to store the items and the other to hold minimum values so `min()` always runs in **constant** time. 

For the second stack to function, we need to update it whenever a new element is added to the main stack. We simpy compare the new element to the current `top()` of the `minimum stack`, updating it as long as it is smaller that what is currently present. This is absolutely important so as to avoid errors in other phases of the algorithm.

Other parts of the solution are trivial and can be seen below:


``` python
class MinStack:

    def __init__(self):
        self.data = []
        self.minimum = []

    def push(self, val: int) -> None:
        self.data.append(val)
        value = min(val, self.minimum[-1] if self.minimum else val)
        self.minimum.append(value)
        

    def pop(self) -> None:
        self.data.pop();
        self.minimum.pop();

    def top(self) -> int:
        return self.data[-1]

    def getMin(self) -> int:
        return self.minimum[-1]

```

---
*Tags: #dsa #leetcode #stack
