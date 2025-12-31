/* * 
 * Given an array of integers 'nums' which is sorted in ascending order, and an integer 'target', write a function to search 'target' in 'nums'.
 * If 'target' exists, then return its index. Otherwise, return -1.
*/
public class BinarySearch {
    public int search(int[] nums, int target) {
        
        int lower = 0;
        int upper = nums.length - 1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            int guess = nums[mid];

            if (guess == target)
                return mid;
            else if (guess < target)
                lower = mid + 1;
            else
                upper = mid - 1;
        }

        return -1;
    }

}