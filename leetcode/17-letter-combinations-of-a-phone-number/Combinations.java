// LC 17: Letter Combinations of a Phone Number

public class Solution {

    private List<String> res = new ArrayList<>();
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"	// indexes 0 and 1 are empty because the numbers run from 2 through 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        backtrack(0, "", digits);
        return res;
    }

    private void backtrack(int i, String curStr, String digits) {
        if (curStr.length() == digits.length()) {
            res.add(curStr);
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for (char c : chars.toCharArray()) {
            backtrack(i + 1, curStr + c, digits);
        }
    }
}
