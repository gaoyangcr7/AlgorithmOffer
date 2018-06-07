package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 */
public class TreeNode {
    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public TreeNode left;
    public TreeNode right;
    public int value;
}
