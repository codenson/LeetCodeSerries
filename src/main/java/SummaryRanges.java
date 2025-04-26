
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guero
 */
public class SummaryRanges {
    public static void main (String[] args ){
       System.out.println(summaryRanges(new int []{0,2,3,4,6,8,9})); 
          System.out.println(summaryRanges(new int []{0,1,2,4,5,7}));
                    System.out.println(summaryRanges(new int []{-1}));
        
    
    }

    public static List<String> summaryRanges(int[] nums) {
        int size = nums.length;
        List<String> list = new ArrayList();
        int j = 0;
        int count  = 0; 

        for (int i = 0; i < size ; i++) {
            j = i;
            while ((j + 1) < size-1 && (nums[j] + 1 == nums[j + 1])) {

                j++;

            }
            if (i == j) {
                list.add(nums[j] + "");
                count++; 
            } else {
                list.add(nums[i] + "->" + nums[j]);
                i = j;
                count+=2; 

            }

        }

        for (int i  = count+1; i < size; i++ ){
            list.add(nums[i] + "");
        }
            
        return list;

    }
    
}
