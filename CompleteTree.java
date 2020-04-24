package LeetCode;


import java.util.LinkedList;
import java.util.Queue;

public class CompleteTree {
    static class TreeNode{
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x)
      {
          val = x;
      }
    }
    public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean stage=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!(queue.isEmpty())){
            TreeNode cur=queue.poll();
            if(!stage){
                if(cur.left==null&&cur.right==null){
                    stage=true;
                }
                else if(cur.left!=null&&cur.right==null){
                    queue.offer(cur.left);
                    stage=true;
                }
                else if(cur.left==null&&cur.right!=null){
                    return false;
                }else if(cur.left!=null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
            }else{
                if(cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }
}
