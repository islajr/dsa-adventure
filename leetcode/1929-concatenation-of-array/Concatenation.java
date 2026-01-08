/* * 
 * LC 1929: Concatenation of Array
 * Given an integer array nums of length n, 
 * you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Return the array ans;
*/
public class Concatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int i = 0;
        int j = i;

        while (i < nums.length) {
            result[i] = nums[i];
            j = i;
            i++;
        }

        i = 0;
        j++;
        while (i < nums.length) {
            result[j] = nums[i];
            i++;
            j++;
        }

        return result;
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = getConcatenation(nums);

        for (int i = 0; i < result.length; ++i)
            System.out.println(result[i]);
    }
}