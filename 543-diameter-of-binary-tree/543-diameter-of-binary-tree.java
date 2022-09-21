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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
      maxDepth(root);
        return diameter;    
    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftPath = maxDepth(root.left);
        int rightPath = maxDepth(root.right);
        diameter = Math.max(diameter, leftPath+rightPath);
        return Math.max(leftPath, rightPath) +1;
    }
}