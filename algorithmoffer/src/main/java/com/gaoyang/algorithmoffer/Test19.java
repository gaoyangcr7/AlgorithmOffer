package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/27.
 * 二叉树的镜像
 * 输入一个二叉树，函数输出他的镜像
 */

public class Test19 {

    private static void printMirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tmpNode;
        tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;

        printMirror(root.left);
        printMirror(root.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = Utils.createTree();
        printMirror(rootNode);
        Utils.preOrderTree(rootNode);
    }


}
