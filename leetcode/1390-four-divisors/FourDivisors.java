/* * 
 * LC 1390: Four Divisors
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. 
 * If there is no such integer in the array, return 0.
*/
public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += divisors(nums[i]);
        }

        return sum;
    }

    int divisors(int n) {
        int sum = 0; int c = 0;
        for (int i = 2; i*i <= n; ++i) { 
            if (n % i == 0) { 
                int j = n / i; 
                if (j == i || c > 0) 
                    return 0; 
                sum += i + j; 
                c++; 
            }
        } 
        
        if (c == 0) 
            return 0; 
        
        return 1 + sum + n;
    }
}
