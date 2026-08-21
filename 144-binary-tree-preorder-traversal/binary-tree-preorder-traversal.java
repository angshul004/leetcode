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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> soln = new ArrayList<>();
        display(root, soln);
        return soln;

    }
    public static void display(TreeNode root, List<Integer> soln){
        if(root==null) return;
        soln.add(root.val);
        display(root.left, soln);
        display(root.right, soln);
    }
}