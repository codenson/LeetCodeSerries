
import java.util.Arrays;

/*
/**
 *
 * @author guero
 */
public class RotateImage {

    public static void main(String args[]) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };
        int[][] matrix1 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}

        };

        rotate(matrix);

    }

    public static void rotate(int[][] matrix) {
        long startTime = System.nanoTime();

        int level = 0;
        int levelsEnd = matrix[0].length - 1;

        while (level < matrix[0].length / 2) {
            int end = levelsEnd;
            for (int i = level; i < matrix.length && level < end; i++) {
                if (end > 0) {
                    int val = matrix[level][end];
                    matrix[level][end] = matrix[i][level];

                    int val1 = matrix[end][levelsEnd];
                    matrix[end][levelsEnd] = val;

                    int val2 = matrix[levelsEnd][i];

                    matrix[levelsEnd][i] = val1;

                    matrix[i][level] = val2;
                } else {
                    matrix[level][end + 1] = matrix[i][level];
                    break;

                }

                end--;

            }

            level++;
            levelsEnd--;

        }

        System.out.println(Arrays.deepToString(matrix));

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time (nanoseconds): " + elapsedTime);

    }
}

/***
 * 48. Rotate Image
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * 
 * Example 2:
 * 
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 
 * Constraints:
 * 
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 * 
 */
