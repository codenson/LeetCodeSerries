
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guero
 */
public class ValidSudoku{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};
        char[][] board2 = {
    {'8','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};
        char[][] board3 = {
    {'.','.','.','.','.','.','5','.','.'},
    {'.','.','.','.','.','.','.','.','.'},
    {'.','.','.','.','.','.','.','.','.'},
    {'9','3','.','.','2','.','4','.','.'},
    {'.','.','7','.','.','.','3','.','.'},
    {'.','.','.','.','.','.','.','.','.'},
    {'.','.','.','3','4','.','.','.','.'},
    {'.','.','.','.','.','3','.','.','.'},
    {'.','.','.','.','.','5','2','.','.'}
};


        
        System.out.println("TwoSum.main()"+ isValidSudoku(board));
        System.out.println("TwoSum.main()"+ isValidSudoku(board2));
         System.out.println("TwoSum.main()"+ isValidSudoku(board3));

    }
    public static boolean isValidSudoku(char[][] board){
    Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    return false;
        }
    }
    return true;
    }
    
    
//     public static boolean isValidSudoku(char[][] board) {
//        boolean outcome = true;
//
//        int[] arr = new int[10];
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//
//                if (Character.isDigit(board[i][j])) {
//                    int val  = board[i][j]-'0'; 
//                   // System.err.println("(int)board[i][j]+1: "+ val);
//                    if (arr[val] != 0) {
//                        return false;
//                    }
//                    arr[val]++;
//                }
//            }
//            arr = new int [10];
//
//        }
//        arr = new int [10];
//         for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//
//                if (Character.isDigit(board[j][i])) {
//                    int val  = board[j][i] -'0'; 
//                    if (arr[val] != 0) {
//                        return false;
//                    }
//                    arr[val]++;
//                }
//            }
//            arr = new int [10];
//
//        }
//         int start  = 0; 
//         int iter = 0; 
//         
//         for (int i = 0; i < board.length; i+=3) {
//              for (int j = 0; j <  board[0].length; j+=3) {
//                  System.out.println("Before : "+Arrays.toString(arr));
//                  if (Character.isDigit(board[i][j]) && arr[board[i][j]-'0']++!= 0 
//                          || Character.isDigit(board[i][j+1]) && arr[board[i][j+1]-'0']++ != 0 
//                          || Character.isDigit(board[i][j+2]) && arr[board[i][j+2]-'0']++ != 0)
//                  {
//                      return false; 
//                  }
//                  System.out.println("After First row : "+Arrays.toString(arr) + "i +j "+ i + j);
//                   if (Character.isDigit(board[i+1][j]) && arr[board[i+1][j]-'0']++ != 0 
//                          || Character.isDigit(board[i+1][j+1]) && arr[board[i+1][j+1]-'0']++ != 0 
//                          || Character.isDigit(board[i+1][j+2]) && arr[board[i+1][j+2]-'0']++ != 0)
//                  {
//                      return false; 
//                  }
//                   System.out.println("After Second row : "+Arrays.toString(arr) + "i +j "+ i + j);
//                   
////                   System.out.println("ValidSudoku.isValidSudoku()"+Arrays.toString(arr));
////                   String S = Arrays.toString(arr); 
//                  
//                    if (Character.isDigit(board[i+2][j]) && arr[board[i+2][j]-'0']++!= 0 
//                          || Character.isDigit(board[i+2][j+1]) && arr[board[i+2][j+1]-'0']++ != 0 
//                          || Character.isDigit(board[i+2][j+2]) && arr[board[i+2][j+2]-'0']++ != 0)
//                  {
//                       String S = Arrays.toString(arr); 
//                      return false; 
//                  }
//                    System.out.println("After third row : "+Arrays.toString(arr) + "i +j "+ i + j);
//                      int val8 = board[i+2][j]-'0'; 
//                        int val9 = board[i+1][j+2]-'0'; 
//                     String S = Arrays.toString(arr); 
//                    
//                  
//                //  j+= 3; 
//                  arr  = new int [10];
//              
//              }
//             
//              arr  = new int [10];
//         }
//
//        return outcome;
//
//    }
    
}
