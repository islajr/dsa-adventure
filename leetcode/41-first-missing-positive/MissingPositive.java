// LC 41: First Missing Positive

class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int number = 1;

        for (int num : nums) {
            if (num > 0 && num == number)
                number++;
        }

        return number;
    }
}
