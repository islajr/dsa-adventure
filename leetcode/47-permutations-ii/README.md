# LC 47 **: [Permutations II]


> **Date:** [2026-06-02]
> **Description:** [LC 47](https://leetcode.com/problems/permutations-ii/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Backtracking]]]

## Approach

### [HashSet]

> **Time Complexity:** O(n! * n)
> **Space Complexity:**  O(n! * n) for the hash set

The problem description says that the the input array `nums` may contain duplicates. As such, the plain [[LC 46]] solution would not work. We need a way to track computed permutations in order to ensure uniqueness. We can use a HashSet to achieve this. In order to track which array elements have been used, we can overwrite the element in the source array to some arbitrary value and then only carry out operations on elements that haven't been used.


``` java
class Solution {

    private Set<List<Integer>> res;

    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new HashSet<>();
        List<Integer> perm = new ArrayList<>();
        backtrack(nums, perm);
        return new ArrayList<>(res);
    }

    private void backtrack(int[] nums, List<Integer> perms) {
        if (perms.size() == nums.length) {
            res.add(new ArrayList<>(perms));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                int temp = nums[i];
                perms.add(nums[i]);
                nums[i] = Integer.MIN_VALUE;

                backtrack(nums, perms);
                nums[i] = temp;
                perms.remove(perms.size() - 1);
            }
        }
    }
}
```

---
*Tags: #dsa #leetcode #backtracking 
