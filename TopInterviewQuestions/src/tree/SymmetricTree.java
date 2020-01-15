package tree;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left,TreeNode right){
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }

        if(!compare(left.left,right.right)){
            return false;
        }
        if(!compare(left.right,right.left)){
            return false;
        }

        return true;
    }
}
