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
    //no need of traversing whole tree. if inside range then return the value adding with recursion to left and right nodes. else if smaller than range, go right. if bigger than range go left. base case is if reached the end return 0.
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val>=low && root.val<=high){
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right,low,high);
        }
        else if(root.val<low){
            return rangeSumBST(root.right, low, high);
        }
        else{
            return rangeSumBST(root.left, low, high);
        }
    }
}