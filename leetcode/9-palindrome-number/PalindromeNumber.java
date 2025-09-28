class PalindromeNumber {

    /* *
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     */
    
    public boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);
        String numberStringRev = reverseString(numberString);
        
        return numberString.equals(numberStringRev);
    }

    private String reverseString(String value) {
        String reversedString = "";
        for (int i = value.length() - 1; i >= 0; --i) {
            reversedString +=value.charAt(i);
        }

        return reversedString;
    }
}