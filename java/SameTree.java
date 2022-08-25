/**
 * https://leetcode.com/problems/same-tree/
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
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> p_node_queue = new LinkedList<>(); 
        Queue<TreeNode> q_node_queue = new LinkedList<>(); 
        
        
        if(p == null && q == null){
            return true;
        }
        
        if( p == null || q == null){
            return false;
        }
        
        if(q.val != p.val){
            return false;
        }else{
            
            p_node_queue.add(p.left);
            p_node_queue.add(p.right);
            q_node_queue.add(q.left);
            q_node_queue.add(q.right);
        
        }
        
        while(!p_node_queue.isEmpty()){
            
           TreeNode node1 = p_node_queue.remove();
           TreeNode node2 = q_node_queue.remove();
            
            if(node1 !=null && node2 !=null){
                
                
                if(node1.val != node2.val){
                    
                    return false;
                    
                }else{

                    p_node_queue.add(node1.left);
                    p_node_queue.add(node1.right);
                    q_node_queue.add(node2.left);
                    q_node_queue.add(node2.right);
                }
             
            }
            
            if(node1 == null && node2 !=null){
                  return false;
            }
            
            if(node2 == null && node1 !=null){
                  return false;
            }
            
        }
        
        if(!q_node_queue.isEmpty()){
            return false;
        }else{
            return true;
        }
        

    }
}