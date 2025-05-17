
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
public class SpiralMatrix {
    
    public static void main (String [] args ){
        
//        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int [][] matrix2 = {{1,2,3,4},
//                            {5,6,7,8},
//                            {9,10,11,12}};
//        
//            int [][] matrix3= {   {1,2,3,4},
//                                  {5,6,7,8},
//                                 {9,10,11,12},
//                                 {13,14,15,16},
//                                 {17,18,19,20},
//                                 {21,22,23,24}
//            };
//        
//         System.out.println(spiralOrderrr(matrix3));
        
    
    }
     public  List<Integer> spiralOrderrr(int[][] matrix){
          List <Integer> list  = new ArrayList<>(); 
         
         int left =0,  right = matrix[0].length-1;
         int upper = 0, down = matrix.length-1; 
         String s  = ""; 
         
         while (left <= right && upper <= down){
             for(int i = left; i <= right; i ++){
                 list.add(matrix[upper][i]);
                 s+=matrix[upper][i]; 
             }
             upper++; 
            
             for(int i = upper; i <= down; i ++){
                 list.add(matrix[i][right]);  
                 s+=matrix[i][right];
             }
             right--; 
             if(upper<= down)
             for(int i = right; i >=left ; i --){
                 list.add(matrix[down][i]);  
                 s+=matrix[down][i];
             }
             down--; 
             if(left<= right)
             for(int i = down; i >= upper ; i --){
                 list.add(matrix[i][left]);  
                 s+=matrix[i][left];
             
             }
             left++; 
//             
//              upper++; 
//              right--; 
//              down--; 
//               left++; 
             
         
         
         }
         
       
         
     
     return  list;
     
     }
    
    
        public static List<Integer> spiralOrder(int[][] matrix) {
            List <Integer> list  = new ArrayList<>(); 
            int size = matrix[0].length * matrix.length; 
            System.err.println("size: "+ size);
            int index  = 0; 
            String s  = ""; 
           // int j = 0; 
           int curr = 0; 
           int counter  = 0; 
           int matSize = matrix[0].length; 
           int rowSize  = matrix[0].length; 
            
            for (int i = 0; i <= matSize && counter < size+10; i++)
            {
                if (i < matSize && i > -1){
                      list.add(matrix[index][i]); 
                      int val  = matrix[index][i]; 
                     s+=matrix[index][i];
                     counter++; 
                     matrix[index][i] = 0; 
                      
                
                }
                else {
                       if (index < matrix.length-1 && i == matrix[0].length){
                           index++; 
                           matSize  = matrix[0].length; 
                           i -=2; 
                       
                       }
                       else if (index ==matrix.length-1 && i > 0){
                           i -=3; 
                           matSize = matSize-1; 
     
                       }
//                       else if(index < matrix.length-1 && i == matSize-1){
//                           index--; 
//                          // i -=1; 
//                       
//                       }
                       
                       else if ((index ==matrix.length-1) && i <=0 ){
                          i = i+1; 
                          while (matrix[--index][0]!=0 && index > 0){
                              list.add(matrix[index][i]); 
                              s+=matrix[index][i];
                              matrix[index][i]=0;
                               
                              counter++; 
                             
                               //index--; 
                           
                           }
                          //i =i-2; 
                          index +=1; 
                          matSize = rowSize-1;
                          rowSize  = rowSize-1; 
                           //System.err.println("Index: "+ ++index);
//                           
//                           if (matrix[++index][0] != 0 )
//                           {
//                           //index--; 
//                           i=-1; 
//                           matSize = matrix[0].length; 
//                           }
                       
                       }
                       else {
                       index++; 
                       i-=2; 
                       
                       }
//                       else if ((index <matrix.length-1) && i == matSize ){
//                           index++; 
//                           //i=1;
//                           i = matSize-1;
//                       
//                       }
                       
                }

            
            }
            
            System.err.println("Counter::::: : " + counter);

            return list; 
        
    }
        
//        public static List<Integer> spiralOrders(int[][] matrix) {
//            List <Integer> list  = new ArrayList<>(); 
//            int size = matrix[0].length * matrix.length; 
//            System.err.println("size: "+ size);
//            int index  = 0; 
//            String s  = ""; 
//           // int j = 0; 
//           int curr = 0; 
//            
//            //for (int i = 0; i < matrix[0].length; i++){
//                for (int j = 0; j < matrix.length; j++)
//                {
//                for (int i = 0; i < matrix[0].length; i++){
//                    // if (i == matrix[0].length || j == matrix.length)
//                    if (i == matrix[0].length )
//                     {
//                         if (i == matrix[0].length && j!= matrix.length){
//                             i = matrix[0].length -2; 
//                             j  +=1; 
//                         }
//                     
//                     
//                     }
//                    else if (j  == matrix.length){
//                        if (i== matrix[0].length){
//                            i =  matrix[0].length-2; 
//                        
//                        }
//                        else if (i ==0 && matrix[i][j] == 0){
//                            j-=1; 
//                                 
//                        }
//                    
//                    }
//                    else {
//                     list.add(matrix[i][j]); 
//                     s+=matrix[i][j];
//                    
//                     matrix[i][j]=0;
//                     
//                    }
//                 
//                 }
//               
//            
//            }
//
//            return list; 
//        
//    }
    
    
}
