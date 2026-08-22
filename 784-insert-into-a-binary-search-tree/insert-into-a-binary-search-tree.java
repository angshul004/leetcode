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
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //if the root is null
        if (root == null) return new TreeNode(val);
        
        //iterate to the place where node needs to be inserted then insert the new node
        TreeNode temp = root;
        while(true){
            if(temp.val>val){
                if(temp.left==null){ 
                    temp.left=new TreeNode(val);
                    break;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null) {
                    temp.right= new TreeNode(val);
                    break;
                }
                temp=temp.right;
            } 
        }

        return root;

        /* recursive method:
        if(root==null) return new TreeNode(val);
        if(val<root.val) root.left = insertIntoBST(root.left,val);
        else root.right = insertIntoBST(root.right,val);
        return root;
         */
    }
}