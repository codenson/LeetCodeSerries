
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class MergeIntervals {

    public static void main(String args[]) {

        int[][] arr = merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {2, 4}});
//        int[][] arr3 = merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
//        int[][] arr4 = merge(new int[][]{{1,4},{0,4}});
        // int[][] arr5 = merge(new int[][]{{1,4},{0,0}});
//      

//        int [][] arr2  = merge(new int[][] {{1,4},{4,5}}); 
        for (int[] c : arr) {
            System.out.println("" + Arrays.toString(c));

        }

    }

    public static int[][] merge(int[][] intervals) {
        int[][] arr = new int[intervals.length][2];
        int front = intervals[0][0];
        int end = intervals[0][1];
        int j = 0;
        int count = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < intervals.length; i++) {
            front = intervals[i][0];
            end = intervals[i][1];
            for (int z = i + 1; z < intervals.length; z++) {
                if (intervals[z][0] != -1) {
                    if ((intervals[z][0] >= front && intervals[z][0] <= end) || (front >= intervals[z][0] && front <= end)) {

                        if ((intervals[z][0] >= front && intervals[z][0] <= end)) {
                            if (intervals[z][1] > end) {
                                intervals[i][0] = front;
                                intervals[i][1] = intervals[z][1];

                            } else {
                                intervals[i][0] = front;
                                intervals[i][1] = end;

                            }
                        } else if ((front >= intervals[z][0] && front <= end)) {
                            if ((intervals[z][1] >= end)) {
                                intervals[i][0] = intervals[z][0];
                                intervals[i][1] = intervals[z][1];
                            } else {
                                if (((front >= intervals[z][0] && front <= intervals[z][1]))) {

                                    intervals[i][0] = intervals[z][0];
                                    intervals[i][1] = end;
                                }

                            }

                        }

                        intervals[z][0] = -1;
                        intervals[z][1] = -1;
                        i = -1;

                        break;
                    }

                }

            }

        }
        int m = 0;

        count = 0;
        for (int t = 0; t < intervals.length; t++) {
            if (intervals[t][0] != -1) {
                count++;
            }
        }
        arr = new int[count][2];
        for (int t = 0; t < intervals.length; t++) {
            if (intervals[t][0] != -1) {
                arr[m][0] = intervals[t][0];
                arr[m][1] = intervals[t][1];
                m++;
            }

        }
        return arr;
    }

}
/**
 * 56. Merge Intervals
Solved
Medium
Topics
Companies

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

 

Constraints:

    1 <= intervals.length <= 104
    intervals[i].length == 2
    0 <= starti <= endi <= 104


 */
