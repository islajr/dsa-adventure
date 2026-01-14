/* * 
 * LC 35: Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.

 * You must write an algorithm with O(log n) runtime complexity.
*/
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int result = nums.length;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid])
                return mid;
            else if (target < nums[mid]) {
                result = mid;
                high = mid - 1;
            } else if (target > nums[mid])
                low = mid + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,2,4,6,8};
        System.out.println(searchInsert(nums, 5));
    }
}