package LeetCode;
//平衡二叉树
public class BinaryTreeIsBalanced110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val = x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(leftDepth-rightDepth>1||leftDepth-rightDepth<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        int max=Math.max(leftDepth,rightDepth)+1;
        return max;
    }

}
