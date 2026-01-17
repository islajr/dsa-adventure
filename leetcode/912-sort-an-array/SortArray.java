/* * 
 * LC 912: Sort an Array
 * Given an array of integers nums, sort the array in ascending order and return it.

 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
*/
public class SortArray {
    public static int[] SortArray(int[] nums) {
        if (nums.length < 2)
            return nums;
        else 
            qsort(nums, 0, nums.length - 1);
        
        return nums;
    }

    /* qsort: recursively sorts the array using the quicksort algorithm */
    private static void qsort(int[] nums, int lower, int higher) {
        if (lower >= higher)
            return;
        int mid = partition(nums, lower, higher);
        qsort(nums, lower, mid);
        qsort(nums, mid + 1, higher);
        
    }

    /* partition: returns an integer holding the value of the sorted middle element of the array */
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

    public static void main(String[] args) {
        int[] unsorted = {110, 100, 0};
        int[] sorted = SortArray(unsorted);

        for (int i : sorted)
            System.out.println(i);
    }
}