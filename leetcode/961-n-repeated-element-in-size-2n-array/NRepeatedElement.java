import java.util.HashMap;

/* * 
 * LC 961: N-Repeated Element in Size 2N Array 
 * You are given an integer array 'nums' with the following properties: 
 *  -  nums.length == 2 * n.
 *  - nums contains n + 1 unique elements.
 *  - Exactly one element of nums is repeated n times.
 *  
 * Return the element that is repeated 'n' times
 * */
public class NRepeatedElement {
    
    public int repeatedNTImes(int[] nums) {
        HashMap<Integer, Boolean> records = new HashMap<>();

        for (int i : nums) {
            if (records.get(i) == null)
                records.put(i, true);
            else
                return i;
        }

        return -1;
    }
}
