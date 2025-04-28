/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guero
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"tflower", "flow", "flight"}));
            System.out.println(longestCommonPrefix(new String[]{""}));
            System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
            System.out.println(longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        String ss=  ""; 
        int j =1; 

        for (int i = 0;  i < strs[0].length(); i++) {
            {
            s += strs[0].charAt(i);
            }        
            while (j < strs.length && strs[j].length()!= 0 && s.length() <=strs[j].length() && strs[j].substring(0, s.length()).equals(s)){
         
                j++; 
            
            }
            if (j == strs.length){
                ss = s; 
                j = 1; 
              
            }
            else {
                return ss; 
            
            }
        }


        return ss;

    }

}
