package com.gaoyang.algorithmoffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by gaoyang on 2018/06/28.
 * 第一版第25题
 * 二叉树中和为某一值的路径
 * 输入一个二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * 从树的根节点开始往下一直到叶节点锁经过的节点形成一条路径
 */
public class Test34 {

    public static void main(String[] args) {

        int target = 22;
        int currentSum = 0;
        Stack<TreeNode> stackSum = new Stack<>();

        hasSum(createTree(), target, currentSum, stackSum);
    }

    private static void hasSum(TreeNode rootNode, int target, int sum, Stack<TreeNode> stack) {
        if (rootNode == null) return;

        sum += rootNode.value;
        stack.push(rootNode);
        boolean isLeaf = rootNode.left == null && rootNode.right == null;

        if (isLeaf && sum == target) {
            System.out.println("\npath found");
            Iterator<TreeNode> iterator = stack.iterator();
            while (iterator.hasNext()) {
                System.out.printf(iterator.next().value + " ");
            }
        }

        if (rootNode.left != null) {
            hasSum(rootNode.left, target, sum, stack);
        }
        if (rootNode.right != null) {
            hasSum(rootNode.right, target, sum, stack);
        }

//        sum -= rootNode.value;
        stack.pop();
    }

    /**
     *     10
     *    /  \
     *   5   12
     *  / \
     * 4  7
     *
     * @return
     */
    private static TreeNode createTree() {
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(5, treeNode4, treeNode7);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode10 = new TreeNode(10, treeNode5, treeNode12);

        return treeNode10;
    }
}
