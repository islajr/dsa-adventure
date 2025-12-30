import java.util.HashMap;

class TwoSum {
    /* *
     * Given an array of integers 'nums' and an integer 'target', return the indices of the two numbers such that they add up to the 'target'.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> records = new HashMap<>();
        int difference;

        for (int i = 0; i < nums.length; ++i) {
            difference = target - nums[i];

            if (records.get(difference) == null)
                records.put(nums[i], i);
            else
                return new int[] {records.get(difference), i};

        }

        return null;
    }
}