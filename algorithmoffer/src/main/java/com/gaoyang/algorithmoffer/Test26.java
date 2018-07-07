package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/14.
 * 第一版第18题
 */
//树的子结构
//输入两颗二叉树A和B，判断B是不是A的子结构
public class Test26 {

    private static boolean hasSubTree(TreeNode fullTreeRoot, TreeNode partTreeRoot) {
        if (fullTreeRoot == null || partTreeRoot == null) {
            return false;
        }

        boolean result = false;
        if (fullTreeRoot.value == partTreeRoot.value) {
            result = isSubTree(fullTreeRoot, partTreeRoot);
        }
        if (!result) {
            result = hasSubTree(fullTreeRoot.left, partTreeRoot);
        }

        if (!result) {
            result = hasSubTree(fullTreeRoot.right, partTreeRoot);
        }

        return result;
    }


    private static boolean isSubTree(TreeNode fullTree, TreeNode partTree) {
        if (partTree == null) {
            return true;
        }
        if (fullTree == null) {
            return false;
        }

        if (fullTree.value != partTree.value) {
            return false;
        }

        return isSubTree(fullTree.left, partTree.left) && isSubTree(fullTree.right, partTree.right);
    }

    public static void main(String[] args) {
        System.out.println(hasSubTree(createFullTree(), createPartTree()));
    }


    private static TreeNode createFullTree() {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode7);
        TreeNode treeNode81 = new TreeNode(8, treeNode9, treeNode2);
        TreeNode treeNode71 = new TreeNode(7);
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
