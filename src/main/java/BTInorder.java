
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guero
 */
public class BTInorder {
    public static  class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main (String [] args){
        TreeNode curr  = new TreeNode(20);
        TreeNode curr1  = new TreeNode(15);
        TreeNode curr2  = new TreeNode(3);
        TreeNode curr3  =new TreeNode(18); 
        TreeNode curr4  = new TreeNode(40);
        TreeNode curr5  = new TreeNode(30);
        TreeNode curr6  = new TreeNode(100);
        curr.left = curr1; 
        curr.right = curr4; 
        curr1.left = curr2; 
        curr1.right = curr3; 
        curr4.left = curr5; 
        curr4.right =curr6; 
       // print( curr); 
       System.err.println(inorderTraversal( curr)); 
        
    
    }
    public static void print(TreeNode root){
        if (root == null){
        
        return  ; 
        }
        
         print( root.left); 
         System.err.println(root.val);
          print( root.right); 
          
          return ; 
        
    
    }
    public static List<Integer> inorderTraversal5(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        

        while (curr != null || !stack.isEmpty()) {
            // Go as far left as possible, pushing nodes on the stack
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            // Pop the last node (leftmost unvisited)
            curr = stack.pop();
            result.add(curr.val);  // Visit the node
            // Move to its right subtree
            curr = curr.right;
        }

        return result;
    }
    
      public static List<Integer> inorderTraversal(TreeNode root) {
      
        List<Integer> list = new ArrayList<Integer>(); 
        TreeNode curr  = root; 
        Stack <TreeNode> s =  new Stack(); 
       
        int count  = 0; 
         while (curr != null ||  !s.isEmpty()){
              while (curr != null){
                  //int left = curr.val; 
                  s.add(curr); 
                  curr= curr.left; 
              
              }
             
              
              
           list.add(s.peek().val); 
             System.err.println("speek : "+ s.peek().val);
           curr  = s.peek().right; 
           s.pop(); 
; 
             
            



         }
         return list ; 
    }
}
