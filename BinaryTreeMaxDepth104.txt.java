package LeetCode;
//二叉树最大深度
public class BinaryTreeMaxDepth104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val = x;
        }
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
