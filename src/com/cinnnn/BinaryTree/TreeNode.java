package src.com.cinnnn.BinaryTree;

public class TreeNode {
    // 二叉树的左孩子节点
    TreeNode left;
    // 二叉树的右孩子节点
    TreeNode right;
    // 二叉树的权值
    int value;
    // 构造函数
    TreeNode (int value){
        value = this.value;
    }

    // 递归方法获取深度，深度优先遍历
    int getBinaryTreeHeight (TreeNode root) {
        if (root == null){
            return 0;
        }else {
           int left_height = getBinaryTreeHeight(root.left);
           int right_height = getBinaryTreeHeight(root.right);
           return java.lang.Math.max(left_height, right_height);
        }
    }

    // 非递归方法获取深度
    int getBinaryTreeHeight2 (TreeNode root){
        return 0;
    }
}
