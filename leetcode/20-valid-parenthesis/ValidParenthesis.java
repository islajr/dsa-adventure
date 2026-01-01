import java.util.Stack;

/* * 
 * LC 20: Valid Parenthesis
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *  - Open brackets must be closed by the same type of brackets.
 *  - Open brackets must be closed in the correct order
 *  - Every close bracket has a corresponding open bracket of the same type.
*/
public class ValidParenthesis {

    // isValid: returns a true if s contains a valid parenthesis and s otherwise
    public static boolean isValid(String s) {

        if (s.length() < 2)
            return false;

        char[] openings = {'(', '{', '['};
        char[] closings = {')', '}', ']'};
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= s.length() - 1; ++i) {
            
            // if is opening bracket
            if (isContained(s.charAt(i), openings)) {
                stack.push(s.charAt(i));
                System.out.println(stack.toString());
            }
            
            // if is closing bracket
            else if (isContained(s.charAt(i), closings)) {
                
                if (stack.isEmpty())
                    return false;

                if (!pairs(stack.peek(), s.charAt(i)))
                    return false;
                else 
                    stack.pop();
                
                
            }

        }
        
        return stack.isEmpty();
        
    }

    // is contained: returns true if s is contained in set and false otherwise
    private static boolean isContained(char c, char[] set) {
        for (char cset : set) {
            if (c == cset)
                return true;
        }

        return false;
    }

    // pairs: returns true is both x and y are pairs and false otherwise
    private static boolean pairs(char x, char y) {
        return x == '[' && y == ']' || x == '{' && y == '}' || x == '(' && y == ')';
    }

    public static void main(String[] args) {
        System.out.println(isValid("){"));

    }
}