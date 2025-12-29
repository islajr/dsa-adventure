import java.util.HashMap;

class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> records = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (records.get(nums[i]) == null)   // if value is not present
                records.put(nums[i], true);
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 5, 6};
        
        System.out.println(hasDuplicate(nums));
    }
}