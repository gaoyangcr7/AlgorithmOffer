package com.gaoyang.test;

import com.gaoyang.Utils;
import com.gaoyang.algorithmoffer.ListNode;
import com.gaoyang.algorithmoffer.TreeNode;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    /**
     * 8
     * /   \
     * 6    10
     * / \  / \
     * 5  7 9  11
     */
    public static void main(String[] args) {
//        TreeNode node = Utils.createTree();
//        orderTree(node);


        int arrList[] = {4, 8, 1, 3, 5, 0, 8, 4, 7, 2, 6, 9};
//        Utils.printListNode(reverseList(Utils.createOrderLinkedList()));
//        mergeSort(arrList, 0, arrList.length-1);
//        quickSort(arrList, 0, arrList.length - 1);
        orderTree(Utils.createTree());
//        Utils.printArr(arrList);
    }

    private static ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode resultHead = null;

        ListNode currentNode = node;
        ListNode preNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                resultHead = currentNode;
            }

            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        return resultHead;
    }

    private static int fibonacci1(int n) {

        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci1(n - 2) + fibonacci1(n - 1);
    }

    private static int fibonacci2(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int fibOne = 0;
        int fibTwo = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = fibOne + fibTwo;

            fibOne = fibTwo;
            fibTwo = result;
        }

        return result;
    }

    private static void orderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                System.out.print(node.value + " ");
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
//                System.out.print(node.value + " ");
                node = node.right;
            }
        }
    }

    private static void mergeSort(int[] arrs, int left, int right) {
        if (arrs == null || arrs.length == 0 || left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arrs, left, mid);
        mergeSort(arrs, mid + 1, right);
        merge(arrs, left, right, mid);
    }

    private static void merge(int[] arrs, int left, int right, int mid) {
        if (arrs == null || arrs.length == 0) {
            return;
        }
        int i = left;
        int j = mid + 1;
        int[] tmpArr = Arrays.copyOfRange(arrs, left, right + 1);

        for (int k = left; k < right + 1; k++) {
            if (i > mid) {
                arrs[k] = tmpArr[j - left];
                j++;
            } else if (j > right) {
                arrs[k] = tmpArr[i - left];
                i++;

            } else if (tmpArr[i - left] < tmpArr[j - left]) {
                arrs[k] = tmpArr[i - left];
                i++;
            } else {
                arrs[k] = tmpArr[j - left];
                j++;
            }

        }
    }

    private static void quickSort(int[] arrs, int left, int right) {
        if (arrs == null || arrs.length == 0 || left > right) {
            return;
        }

        int key = arrs[left];
        int partition = partitionIt(arrs, left, right, key);
        quickSort(arrs, left, partition - 1);
        quickSort(arrs, partition + 1, right);
    }

    private static int partitionIt(int[] arrs, int left, int right, int key) {
        if (arrs == null || arrs.length == 0) {
            return -1;
        }
        int initLeft = left;
        int i = left;
        int j = right;

        while (i < j) {

            while (i < j && arrs[j] >= key) {
                j--;
            }
            while (i < j && arrs[i] <= key) {
                i++;
            }

            Utils.swap(arrs, i, j);
        }

        Utils.swap(arrs, i, initLeft);
        return i;
    }
}

