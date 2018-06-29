package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 */
public class TreeNode {
    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public TreeNode left;
    public TreeNode right;
    public int value;


}
