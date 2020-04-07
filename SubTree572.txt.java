package LeetCode;

public class SubTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        boolean ret=false;
        if(s.val==t.val){
            ret=isSameTree(s,t);
        }
        return ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    private boolean isSameTree(TreeNode m,TreeNode n){
        if(m==null&&n==null){
            return true;
        }
        if(m==null||n==null){
            return false;
        }
        if(m.val!=n.val){
            return false;
        }
        return isSameTree(m.left,n.left)&&isSameTree(m.right,n.right);
    }
}
