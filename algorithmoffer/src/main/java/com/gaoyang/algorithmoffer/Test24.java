package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/13.
 * 第一版第16题
 */

//反转链表
//输入一个链表的头节点，反转并输出反转后链表的头节点
public class Test24 {


    private static ListNode revert(ListNode headNode) {
        ListNode reverseHead = null;
        ListNode node = headNode;
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            if (next == null) reverseHead = node;

            node.next = prev;
            prev = node;
            node = next;
        }
        return reverseHead;
    }


    private static ListNode revert2(ListNode headNode) {
        if (headNode == null) return null;
        ListNode prevNode = null;
        ListNode currentNode = headNode;

        ListNode reheadNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) reheadNode = currentNode;

            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return reheadNode;
    }

    public static void main(String[] args) {
        ListNode listNode = Utils.createOrderLinkedList();
        ListNode resultNode = revert2(listNode);
        System.out.println(resultNode.value);
        Utils.printListNode(resultNode);
    }
}
