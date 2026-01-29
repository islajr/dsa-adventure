
import java.util.HashSet;
import java.util.Set;

/* * 
 * LC 219: Contains Duplicate II
 *
 * Given an integer array nums and an integer k, 
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/
public class ContainsDuplicateII {
    public boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> hashSet = new HashSet<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                hashSet.remove(nums[l]);
                l++;
            }

            if (hashSet.contains(nums[r]) && r - l <= k)
                return true;

            hashSet.add(nums[r]);
        }

        return false;
    }
}