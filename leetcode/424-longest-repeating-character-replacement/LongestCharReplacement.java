import java.util.HashSet;

/* * 
 * LC 424: Longest Repeating Character Replacement
 * 
 * You are given a string s and an integer k. 
 * You can choose any character of the string and change it to any other uppercase English character. 
 * You can perform this operation at most k times.

 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
*/
public class LongestCharReplacement {
    public int charReplacement(String s, int k) {
        HashSet<Character> hashSet = new HashSet<>();
        int result = 0;

        for (char c : s.toCharArray())
            hashSet.add(c);

        for (char c : hashSet) {
            int count = 0, l = 0;

            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c)
                    count++;

                while ((r - l + 1) - count > k) {   // if window too large
                    if (s.charAt(l) == c)
                        count--;
                    l++;    // reduce window size
                }
                
                result = Math.max(result, r - l + 1);
            }

        }

        return result;
    }
}