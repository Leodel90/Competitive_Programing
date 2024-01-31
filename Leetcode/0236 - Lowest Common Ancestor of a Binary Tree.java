/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca;
    boolean lcaFound;
    
    public void dfs(TreeNode node, TreeNode parent, TreeNode p, TreeNode q) {
        if(node == null || lcaFound) return;
        if(node.val == p.val || node.val == q.val){
            if (lca == null) {
                lca = node;
            } else {
                lcaFound = true;
            }
        }
        dfs(node.left, node, p, q);
        dfs(node.right, node, p, q);
    
        if(!lcaFound && lca != null && lca.val == node.val){
            lca = parent;
        }
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lcaFound = false;
        dfs(root, null, p, q);
        return lca;
    }
}
