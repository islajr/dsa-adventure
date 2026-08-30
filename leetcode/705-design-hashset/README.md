# LC 705: [Design HashSet]


> **Date:** [2026-08-30]
> **Description:** [LC 705 ](https://leetcode.com/problems/design-hashset/description/)
> **Difficulty:** [Easy]
> **Category:** [[dsa-concepts#[Arrays|Arrays]]

## Approach

### [Brute Force]

> **Time Complexity:** $O(n)$
> **Space Complexity:** $O(n)$

The description necessitates the design of a hash set. The intuitive way to go is to use a list within the constructor to store said numbers. After this, all we need do is to respect all the defining features of a set and mimic it as best we can without compromising too much on speed. We conduct an initial check before adding an element to ensure that only one version is present. We do the same for removals to prevent errors. This approach is trivial, but has a $O(n)$ time complexity as we constantly have to look up values within the array.

``` python
class MyHashSet:

    def __init__(self):
        self.arr = []

    def add(self, key: int) -> None:
        if key not in self.arr:
            self.arr.append(key)

    def remove(self, key: int) -> None:
        if key in self.arr:
            self.arr.remove(key)

    def contains(self, key: int) -> bool:
        if key in self.arr:
            return True
        else:
            return False
```

### [Boolean Array]

> **Time Complexity:** $O(1)$
> **Space Complexity:** $O(1,000,000)$

This approach uses the specific hard limit of 1,000,000 keys detailed in the description to ensure $O(1)$ lookups and $O(1,000,000)$ space complexity in the worst case. To effect this, we simply maintain a character array of default false values and only toggle each value to `true` when it is explicitly added to the hashset. Removal toggles it back to `false` and the `contains()` check simply returns the stored value. Lookups are through indexing so they are constant.

``` python
class MyHashSet:

    def __init__(self):
        self.data = [False] * 1000001

    def add(self, key: int) -> None:
        self.data[key] = True

    def remove(self, key: int) -> None:
        self.data[key] = False

    def contains(self, key: int) -> bool:
        return self.data[key]
```

---
*Tags: #dsa #leetcode #arrays 
