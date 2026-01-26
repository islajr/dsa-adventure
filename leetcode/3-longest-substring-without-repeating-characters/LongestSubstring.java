
import java.util.HashSet;

/* *
 * LC 3: Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest substring without duplicate characters. 
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charset = new HashSet<>();
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charset.contains(s.charAt(right))) {
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}