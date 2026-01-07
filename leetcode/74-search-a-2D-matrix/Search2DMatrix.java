/* * 
 * LC 74: Search a 2D Matrix
 * You are given an m x n integer matrix matrix with the following two properties:
 *  - Each row is sorted in non-decreasing order.
 *  - The first integer of each row is greater than the last integer of the previous row.
 * 
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
*/
public class Search2DMatrix {
    public boolean search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            // if target is in array
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                // conduct binary search on array
                int low = 0;
                int high = matrix[i].length - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (target == matrix[i][mid])
                        return true;
                    else if (target < matrix[i][mid])
                        high = mid - 1;
                    else if (target > matrix[i][mid])
                        low = mid + 1;
                }
            }
        }

        return false;
    }
}