package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/07/09.
 * 二叉树深度
 */
public class Test55_1 {

    private static int getTreeDeep(TreeNode rootNode) {

        if (rootNode == null) {
            return 0;
        }

        int deep;

        int left = getTreeDeep(rootNode.left);
        int right = getTreeDeep(rootNode.right);
        if (left > right) {
            deep = left+1;
        } else {
            deep = right+1;
        }
        return deep;
    }


    public static void main(String[] args) {

        System.out.println("deep: "+getTreeDeep(createTree()));
    }

    /**
     *        1
     *      /  \
     *     2    3
     *    / \    \
     *   4  5    6
     *     /
     *    7
     *
     * @return
     */
    private static TreeNode createTree() {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5, treeNode7, null);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(3, null, treeNode6);
        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);

        return treeNode1;
    }
}
