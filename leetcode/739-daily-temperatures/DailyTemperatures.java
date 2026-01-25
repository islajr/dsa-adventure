import java.util.Stack;

/* * 
 * LC 739 - Daily Temperatures
 * 
 * Given an array of integers temperatures represents the daily temperatures, 
 * return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. 
 * 
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
*/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // [temp, index]
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }

            stack.push(new int[]{temp, i});
        }

        return result;
    }
}