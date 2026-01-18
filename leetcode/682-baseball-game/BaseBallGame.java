import java.util.Stack;

/* * 
 * LC 682: Baseball Game
 * 
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

 * An integer x.
 *  Record a new score of x.
 * 
 * '+'.
 *  Record a new score that is the sum of the previous two scores.
 * 
 * 'D'.
 *  Record a new score that is the double of the previous score.
 * 
 * 'C'.
 *  Invalidate the previous score, removing it from the record.
 * 
 * Return the sum of all the scores on the record after applying all the operations.
*/
public class BaseBallGame {
    public static int calculatePoints(String[] operations) {

        if (operations.length == 0)
            return 0;

        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (!"D".equals(s) && !"+".equals(s) && !"C".equals(s))
                stack.addElement(Integer.valueOf(s));
            else {
                if (null != s)
                    switch (s) {
                    case "D" -> stack.addElement(stack.getLast() * 2);
                    case "+" -> stack.addElement(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
                    case "C" -> stack.removeLast();
                    default -> {
                    }
                }
            }
 
        }

        if (stack.capacity() > 0)
            return computeResult(stack);
        else 
            return 0;
    }

    private static int computeResult(Stack<Integer> s) {
        int result = 0;
        for (Integer i : s)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        String[] ops = {"1","C"};
        System.out.println(calculatePoints(ops));
    }

    
}