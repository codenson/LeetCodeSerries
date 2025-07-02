
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};

        System.out.println("MajorityElement.main()"+majorityElement(arr));
        System.out.println("\n MajorityElement.main()" + majorityElement(new int[]{6, 5, 5}));
        System.out.println("MajorityElement.main()"+majorityElement(new int [] {3,3,4}));

    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            map.merge(nums[i], 1, Integer::sum);

        }

        for (Integer k : map.keySet()) {

            if (map.get(k) > map.get(max)) {
                max = k;

            }

        }

        return max;

    }

}

/**
 * 169. Majority Element
Solved
Easy
Topics
premium lock iconCompanies

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109

 
Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
