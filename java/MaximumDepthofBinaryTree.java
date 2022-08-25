/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
class MaximumDepthofBinaryTree {
    
    
    
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
       return dfs(root)+1;
    }
    
    public int dfs(TreeNode root) {
        
        
        if(root == null){
            return 0;
        }
        
        int left_level = 0;
        int right_level= 0;
    
         
        if(root.left != null){
           left_level = dfs(root.left ) + 1;
        }
        
        
        if(root.right != null){
            right_level = dfs(root.right ) + 1;
        }
        
        return Math.max(left_level,right_level);
    }
}