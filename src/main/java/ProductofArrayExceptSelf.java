
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class ProductofArrayExceptSelf {

    public static void main(String arg[]) {
        int[] num = new int[]{1, 2, 3, 4};
        int[] num2 = new int[]{-1,1,0,-3,3};
     
        System.out.println(Arrays.toString(productExceptSelf(num)));
         System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));

    }
 
    public static int[] productExceptSelf(int[] nums) {

        int left = nums[0];
        int right = nums[nums.length - 1];
        int end = nums.length - 1;
        int[] arr = new int[nums.length];
        arr[0] = 1;
        arr[end]= 1; 
       
        

        for (int i  = 1; i < nums.length; i++){
            arr[i] = arr[i-1]*nums[i-1]; 
            
        }
         for (int i = nums.length - 2; i > 0; i--) {

        
            right = right * nums[i];
            arr[i - 1] *= right;
        }
    
        right = 1;
    
//        for (int i = nums.length - 1; i > 0; i--) {
//        
//            right = right * nums[i];
//            arr[i - 1] *= right;
//        }
        return arr;
//     int suffix = 1;
//        int[] ans = new int[nums.length];
//        ans[0] = 1;
//
//        //caculate prefix
//        for(int i = 1; i < nums.length; i++){
//            ans[i] = ans[i-1] * nums[i - 1];
//        }
//        System.out.println("ProductofArrayExceptSelf.productExceptSelf()"+ Arrays.toString(ans));
//
////        for(int i = nums.length - 2; i >= 0; i--){
////            suffix *= nums[i + 1];
////            ans[i] *= suffix;
////        }
//
//        return ans;
    }

}
