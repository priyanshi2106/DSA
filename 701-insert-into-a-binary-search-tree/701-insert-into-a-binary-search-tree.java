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
//         TreeNode tn = new TreeNode(val);
//         TreeNode t = root;
//         while(t != null){
//             if(tn.val < root.val){
//                 if(t.left == null){
//                     t.left = tn;
//                    return root;
//                 }
//                 else{
//                     t = t.left;
//                 }
//             }
//             else  {
//                 if(t.right == null){
//                     t.right = tn;
//                     return root;
//                 }
//                 else{
//                     t = t.right;
//                 }
//             }
            
            
//         }
    
//                 return root;
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left,val);
        }
        else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
           
    }
}