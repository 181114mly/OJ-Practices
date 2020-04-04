package LeetCode;

import java.util.LinkedList;
import java.util.List;
//二叉树的中序遍历
    class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

public class InOrderBinaryTree94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
         if(root==null){
             return result;
         }
         inorderTraversal(root.left);
         result.add(root.val);
         inorderTraversal(root.right);
         return result;
    }
}
