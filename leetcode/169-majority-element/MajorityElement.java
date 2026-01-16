import java.util.Arrays;
/* * 
 * LC 169: Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times in the array. 
 * You may assume that the majority element always exists in the array.
*/
public class MajorityElement {
    public int MajorityElement(int[] nums) {

        /* * 
         * Approach: 
         * 
         * If the array is sorted, the majority element, occuring at least, n / 2 times should be in the middle of the array
        */
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }    
}
