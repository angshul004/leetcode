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
    static  ArrayList<Integer> soln;
    public int kthSmallest(TreeNode root, int k) {
        //inorder traversal makes sorted arraylist
        soln = new ArrayList<>();
        inorder(root,k);
        return soln.get(k-1);
    }
    public void inorder(TreeNode root, int k){
        if(soln.size()==k) return;
        
        if(root==null) return;
        inorder(root.left,k);
        soln.add(root.val);
        inorder(root.right,k);
    }
}