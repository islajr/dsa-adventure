class TwoSum {
    /* *
     * Given an array of integers 'nums' and an integer 'target', return the indices of the two numbers such that they add up to the 'target'.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (verify(target, nums[i], nums[j])) {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.println("[" + i + ", " + j + "]");
                    return answer;
                }
            }
        }
        System.out.println("could not compute. check the values again!");
        return null;
    }

    private boolean verify(int target, int i, int j) {
        return ((i + j) == target);
    }
}