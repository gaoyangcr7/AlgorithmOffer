package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/14.
 * 第一版第17题
 */

//合并两个排序的链表
public class Test25 {

    //递归
    private static ListNode merge(ListNode one, ListNode two) {
        ListNode resultNode = null;
        if (one == null) {
            return two;
        } else if (two == null) {
            return one;
        }

        if (one.value < two.value) {
            resultNode = one;
            resultNode.next = merge(one.next, two);
        } else {
            resultNode = two;
            resultNode.next = merge(one, two.next);
        }

        return resultNode;
    }

    public static void main(String[] args) {
        ListNode result = merge(createListOne(), createListTwo());
        Utils.printListNode(result);
    }

    private static ListNode createListOne() {
        ListNode linkedNode9 = new ListNode(9);
        ListNode linkedNode7 = new ListNode(7, linkedNode9);
        ListNode linkedNode5 = new ListNode(5, linkedNode7);
        ListNode linkedNode3 = new ListNode(3, linkedNode5);
        ListNode linkedNode1 = new ListNode(1, linkedNode3);

        return linkedNode1;
    }

    private static ListNode createListTwo() {
        ListNode linkedNode10 = new ListNode(10);
        ListNode linkedNode8 = new ListNode(8, linkedNode10);
        ListNode linkedNode6 = new ListNode(6, linkedNode8);
        ListNode linkedNode4 = new ListNode(4, linkedNode6);
        ListNode linkedNode2 = new ListNode(2, linkedNode4);

        return linkedNode2;
    }
}
