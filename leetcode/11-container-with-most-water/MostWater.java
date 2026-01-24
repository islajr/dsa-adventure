/* * 
 * LC 11 - Container with most water
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

 * Find two lines that together with the x-axis form a container, such that the container contains the most water.

 * Return the maximum amount of water a container can store.

 * Notice that you may not slant the container.
*/
public class MostWater {
    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int result = 0;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            result = Math.max(result, area);

            if (heights[left] <= heights[right])
                left++;
            else
                right--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};

        System.out.println(maxArea(heights));
    }
}