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
    List<List<Integer>> rootToLeaf;
    LinkedList<Integer> stack;
    int targetSum;
    public void dfs (TreeNode node, int sum) {
        if(node==null) return;
        stack.addLast(node.val);
        if(node.left !=null || node.right!= null){
            dfs(node.left, sum + node.val);
            dfs(node.right, sum + node.val);
        } else {
            if(sum +node.val == targetSum){
                rootToLeaf.add( new ArrayList<Integer>(stack));
            }
        }
        stack.removeLast();
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        stack = new LinkedList<Integer>();
        rootToLeaf = new LinkedList<List<Integer>>();
        this.targetSum = targetSum;
        dfs(root, 0);
        return rootToLeaf;
    }
}
