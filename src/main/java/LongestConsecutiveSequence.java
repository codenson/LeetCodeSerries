
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author guero
 */
public class LongestConsecutiveSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        longestConsecutive1(new int[]{100, 4, 200, 1, 3, 2, 3}); 

        // System.err.println("val : " + longestConsecutive1(new int[]{100, 4, 200, 1, 3, 2}));
        //System.err.println("val : " + longestConsecutive1(new int[]{1, 0, 1, 2}));
//        System.err.println("val : " + longestConsecutive(new int[]{ 5, 6, 7,8}));
//        System.err.println("val : " + longestConsecutive(new int[]{ 0,1,5, 6, 7,8}));
//        System.err.println("val : " + longestConsecutive(new int[]{ }));
//        Assert.assertEquals(4, longestConsecutive4(new int[]{100, 4, 200, 1, 3, 2}));
//        Assert.assertEquals(3, longestConsecutive4(new int[]{1, 0, 1, 2}));
//        Assert.assertEquals(4, longestConsecutive4(new int[]{5, 6, 7, 8}));
        //  Assert.assertEquals(4, longestConsecutive4(new int[]{0, 1, 5, 6, 7, 8}));
//        Assert.assertEquals(0, longestConsecutive2(new int[]{}));
        Assert.assertEquals(4, longestConsecutive4(new int[]{9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7}));

    }

    public static int longestConsecutive4(int[] nums) {
        if (nums.length == 0) {

            return 0;
        }
        TreeSet<Integer> numSet = new TreeSet();

        for (Integer n : nums) {

            numSet.add(n);

        }
        System.err.println("TreeMap : " + numSet);

        Object[] arr = numSet.toArray();

        int count = 1;
        int total = 0;

        for (int i = 1; i < arr.length && arr.length > 0; i++) {
            int prev = (int) arr[i - 1];
            int curr = (int) arr[i];
            if (prev + 1 == curr || prev == curr) {
                if (prev != curr) {
                    count++;
                }

            } else {
                if (total <= count) {
                    total = Math.max(total, count);

                }
                count = 1;

            }

        }
        return Math.max(total, count);

    }

    public static int longestConsecutive3(int[] nums) {
        Set<Integer> numSet = new HashSet();

        for (Integer c : nums) {
            numSet.add(c);
        }
        int count = 0;
        int longestSequence = 0;

        for (Integer n : numSet) {

            if (!numSet.contains(n - 1)) {

                count = 1;
                int curr = n;
                while (numSet.contains(curr + 1)) {
                    count++;
                    curr++;
                }

            }
            longestSequence = Math.max(longestSequence, count);
        }

        return longestSequence;

    }

//
    public static int longestConsecutive2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] arr = new int[(int) Math.pow(10, 5)];
        int count = 1;
        int clVal = 0;
        int trackInput = 0;

        for (Integer c : nums) {
            arr[c] = 1;

        }
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];

            if (arr[i - 1] == 1 && arr[i] == 1) {
                count++;
                trackInput++;
            } else {
                clVal = Math.max(clVal, count);
                count = 1;

            }
            if (trackInput == nums.length) {
                break;
            }

        }

        return Math.max(clVal, count);

    }

    public static int longestConsecutive1(int[] nums) {//100,4,200,1,3,2
        if (nums.length == 0) {
            return 0;
        }

        TreeMap<Integer, Integer> map = new TreeMap();
        int[] arr = new int[(int) Math.pow(2, 10)];

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);

            } else {
                map.put(nums[i], map.get(nums[i]) + 1);

            }

        }
        /// System.err.println("Tree: " + map);

        int end = 1;
        int lcVal = 0;
//        Object [] a = map.firstEntry(); 
        Set<Integer> set = map.keySet();
//         System.err.println("Set : "+  Arrays.toString(set.toArray()) + map.keySet());

        Object[] aaa = set.toArray();
        for (int i = 1; i < set.toArray().length; i++) {
            int prev = (int) set.toArray()[i - 1];
            int curr = (int) set.toArray()[i];
            if (prev + 1 == curr) {
                end++;
            } else {
                if (lcVal < end) {
                    lcVal = end;

                }
                end = 1;

            }

        }
//         

        return Math.max(lcVal, end);
    }

    public static int longestConsecutive(int[] nums) { //1,2,3,4,100,200
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet();
//        for (int i =0; i < nums.length; i++){
//            numSet.add(nums[i]); 
//        
//        
//        } 
        for (int num : nums) {
            numSet.add(num);
        }
//       numSet.

//        System.err.println("Map : "+ numSet);
        Object[] num = numSet.toArray();

        int end = 1;
        int lcVal = 0;
        for (int i = 1; i < num.length && nums.length > 0; i++) {
            int prev = (int) num[i - 1];
            System.out.println("LongestConsecutiveSequence.longestConsecutive()" + prev);

            if (prev + 1 == (int) num[i] || prev == (int) num[i]) {
                if (prev != (int) num[i]) {
                    end++;
                }

            } else {

                if (lcVal < end) {
                    lcVal = end;

                }
                end = 1;

            }

        }
        return Math.max(lcVal, end);

    }

}
/**
 * 128. Longest Consecutive Sequence Solved Medium Topics premium lock
 * iconCompanies
 *
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2] Output: 4 Explanation: The longest
 * consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1] Output: 9
 *
 * Example 3:
 *
 * Input: nums = [1,0,1,2] Output: 3
 *
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105 -109 <= nums[i] <= 109
 *
 *
 */
