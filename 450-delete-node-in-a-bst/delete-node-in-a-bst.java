class Solution {
    public static void delete(TreeNode root, int target) {
        if (root == null) return;

        // Delete in left subtree
        if (root.left != null && root.left.val == target) {
            TreeNode del = root.left;

            // Case 1: leaf node
            if (del.left == null && del.right == null) {
                root.left = null;
            }
            // Case 2: one child
            else if (del.left == null || del.right == null) {
                root.left = (del.left != null ? del.left : del.right);
            }
            // Case 3: two children
            else {
                TreeNode curr = del;
                TreeNode inp = curr.left;
                // find inorder predecessor
                while (inp.right != null) inp = inp.right;

                delete(curr, inp.val);  // delete inorder predecessor
                inp.left = del.left;
                inp.right = del.right;
                root.left = inp;
            }
            return;
        }

        // Delete in right subtree
        if (root.right != null && root.right.val == target) {
            TreeNode del = root.right;

            // Case 1: leaf node
            if (del.left == null && del.right == null) {
                root.right = null;
            }
            // Case 2: one child
            else if (del.left == null || del.right == null) {
                root.right = (del.left != null ? del.left : del.right);
            }
            // Case 3: two children
            else {
                TreeNode curr = del;
                TreeNode inp = curr.left;
                while (inp.right != null) inp = inp.right;

                delete(curr, inp.val);
                inp.left = del.left;
                inp.right = del.right;
                root.right = inp;
            }
            return;
        }

        // Traverse left or right normally
        if (root.val > target) delete(root.left, target);
        else delete(root.right, target);
    }


    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;     // Important fix
        delete(temp, key);
        return temp.left;     // return updated root
    }
}
