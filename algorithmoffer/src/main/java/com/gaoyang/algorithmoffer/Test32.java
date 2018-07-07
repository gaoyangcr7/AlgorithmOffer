package com.gaoyang.algorithmoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyang on 2018/06/28.
 * 第一版23题
 * 从上到下打印二叉树
 */
public class Test32 {

    private static void printTreeTop2Bottom(TreeNode root) {
        if (root == null) return;

        List<TreeNode> tmpTreeList = new ArrayList<>();

        TreeNode pointerNode = root;
        tmpTreeList.add(pointerNode);

        while (pointerNode != null) {

            if (pointerNode.left != null) {
                tmpTreeList.add(pointerNode.left);
            }

            if (pointerNode.right != null) {
                tmpTreeList.add(pointerNode.right);
            }

            System.out.print(tmpTreeList.remove(0).value+" ");
            if (tmpTreeList.size() > 0) {
                pointerNode = tmpTreeList.get(0);
            } else {
                pointerNode = null;
            }


        }
    }

    public static void main(String[] args) {
        printTreeTop2Bottom(Utils.createTree());
    }
}
