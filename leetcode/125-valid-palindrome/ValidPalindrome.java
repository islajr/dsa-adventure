/* * 
 * LC 125: Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
*/
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String fs = "";

        // format string
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                fs += s.charAt(i);
        }

        // quick check
        // System.out.println(fs);
        if (fs.length() == 0)
            return true;

        // traversing the formatted string with two-pointer tech
        int left = 0;
        int right = fs.length() - 1;

        while (left < right) {
            if (fs.charAt(left) != fs.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
}