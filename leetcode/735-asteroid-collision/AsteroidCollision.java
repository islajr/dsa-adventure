import java.util.Stack;

/* * 
 * LC 735 - Asteroid Collision
 * We are given an array asteroids of integers representing asteroids in a row. 
 * The indices of the asteroid in the array represent their relative position in space.

 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). 
 * Each asteroid moves at the same speed.

 * Find out the state of the asteroids after all collisions. 
 * If two asteroids meet, the smaller one will explode. 
 * If both are the same size, both will explode. 
 * Two asteroids moving in the same direction will never meet.
*/
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                int diff = a + stack.peek();

                if (diff < 0)
                    stack.pop();
                else if (diff > 0)
                    a = 0;
                else {   //  they cancel each other out
                    stack.pop();
                    a = 0;
                }

            }

            if (a != 0)
                stack.add(a);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}