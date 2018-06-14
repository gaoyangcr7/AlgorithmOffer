package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/14.
 */
//树的子结构
//输入两颗二叉树A和B，判断B是不是A的子结构
public class Test18 {

    private static boolean isSubTree(TreeNode fullTreeRoot, TreeNode partTreeRoot) {
        boolean isSubTree = false;

        return isSubTree;
    }

    public static void main(String[] args) {
        System.out.println(isSubTree(createFullTree(), createPartTree()));
    }


    private static TreeNode createFullTree() {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode7);
        TreeNode treeNode81 = new TreeNode(81, treeNode9, treeNode2);
        TreeNode treeNode71 = new TreeNode(71);
        TreeNode treeNode8 = new TreeNode(8, treeNode81, treeNode71);

        return treeNode8;
    }

    private static TreeNode createPartTree() {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode8 = new TreeNode(8, treeNode9, treeNode2);
        return treeNode8;
    }
}
