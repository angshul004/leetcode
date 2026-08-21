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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> soln = new ArrayList<>();

        additems(root, soln);
        return soln;
    }
    public static void additems(TreeNode root, List<Integer> soln){
        if(root==null) return;
        additems(root.left, soln);
        soln.add(root.val);
        additems(root.right, soln);
    }
}