
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guero
 */
public class RansomNote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String magazine  = "aab"; 
        String ransomNote = "aa"; 
       
        System.out.println();
        System.out.println("RansomNote.main()"+ canConstruct( ransomNote,  magazine));
//        magazine = "ab"; 
//        ransomNote = "aa"; 
//        System.out.println("RansomNote.main()"+ canConstruct( ransomNote,  magazine));
//        
    }
    
 public static boolean canConstruct(String ransomNote, String magazine) {
     int[] arr = new int[26];
    int len = Math.max(ransomNote.length(), magazine.length());

    for (int i = 0; i < len; i++) {
        if (i < magazine.length()) {
            arr[magazine.charAt(i) - 'a']++;
        }
        if (i < ransomNote.length()) {
            arr[ransomNote.charAt(i) - 'a']--;
            if (arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
    }
    return true;
//
//        HashMap<Character,Integer> map = new HashMap(); 
//
//        for (int i = 0; i < magazine.length(); i++){
//
//         char ch =magazine.charAt(i);
//  
//            if(map.containsKey​(ch)){
//                map.put(ch,map.get(ch)+1);
//
//            }
//            else
//            map.put(ch, 1); 
//
//        }
//        for (int j  = 0; j < ransomNote.length(); j++){
//
//            if (map.containsKey​(ransomNote.charAt(j)) ){
//                 map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j))-1);
//                 if (map.get(ransomNote.charAt(j)) == 0){
//                    map.remove((ransomNote.charAt(j)));
//                 }
//              
//            }else {
//                
//
//  return false; 
//            }
//        }
//        return true; 


    }
    
}
