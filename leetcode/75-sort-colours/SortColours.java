/* * 
 * LC 75: Sort Colours
 * Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

 * You must solve this problem without using the library's sort function.
*/
public class SortColours {
    public static void sortColours(int[] nums) {
        if (nums.length >= 2)
            qsort(nums, 0, nums.length - 1);
    }

    /* qsort: recursively sorts the array using the quicksort algorithm */
    private static void qsort(int[] nums, int lower, int higher) {
        if (lower < higher) {
            int mid = partition(nums, lower, higher);
            qsort(nums, lower, mid);
            qsort(nums, mid + 1, higher);
        }

    }

    /* partition: returns and integer holding the position of the sorted middle element of the array */
    private static int partition(int[] nums, int lower, int higher) {
        int pivot = nums[lower];
        
        while (lower < higher) {
            while (lower < higher && nums[higher] >= pivot)
                higher--;
            nums[lower] = nums[higher];

            while (lower < higher && nums[lower] <= pivot)
                lower++;
            nums[higher] = nums[lower];
        }

        nums[lower] = pivot;
        return lower;
    }
}