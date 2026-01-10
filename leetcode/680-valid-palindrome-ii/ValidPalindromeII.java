/* * 
 * LC 680: Valid Palindrome II
 * 
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
*/
public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(0, left) + s.substring(left + 1))
                    || isPalindrome(s.substring(0, right) + s.substring(right + 1));
            }

            left++;
            right--;
        }

        return true;
    }

    private static  boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abbdd"));
    }
}