package tree;

public class ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
   }

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(TreeNode node,long min,long max) {
        if(node == null) {
            return true;
        }

        if(node.val > min && node.val < max) {
            if(check(node.left, min, node.val) &&
                check(node.right, node.val, max)){
                return true;
            }
        }

        return false;
    }
}
