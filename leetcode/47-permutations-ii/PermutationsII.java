// LC 47: Permutations II

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
