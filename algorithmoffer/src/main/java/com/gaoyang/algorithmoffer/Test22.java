package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/13.
 * 第一版第15题
 */

//链表中倒数第k个节点
public class Test22 {

    /**
     * 遍历两遍
     * 第一遍，统计出链表总共有多多长，长度为N
     * 第二遍，找到倒数第K个节点，删掉
     *
     * @param headNode
     * @param targetIndex
     */
    private static void removeNode(ListNode headNode, int targetIndex) {

        if (headNode == null) return;

        ListNode targetNode = headNode;
        ListNode previewNode = headNode;
        ListNode tmpNode = headNode;
        int length = 0;
        while (tmpNode != null) {
            length++;
            tmpNode = tmpNode.next;
        }

        if (length < targetIndex) {
            return;
        }

        int index = length - targetIndex + 1;   //倒数第targetIndex个数是正数第index个

        while (index != 0) {
            previewNode = targetNode;
            targetNode = targetNode.next;
            index--;
        }

        if (targetNode.next != null) {
            previewNode.next = targetNode.next;
        } else {
            previewNode.next = null;
        }

        System.out.println("target node value: " + targetNode.value);
        Utils.printListNode(previewNode);
    }

    /**
     * 遍历一遍
     *
     * @param headNode
     * @param targetIndex
     */
    private static void removeNode2(ListNode headNode, int targetIndex) {
        if (headNode == null) {
            return;
        }

        ListNode leftNode = headNode;
        ListNode rightNode = headNode;

        for (int i = 0; i < targetIndex; i++) {
            rightNode = rightNode.next;
            if (rightNode == null) {
                System.out.println("return");
                return;
            }
        }

        while (rightNode.next != null) {
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        ListNode targetNode = leftNode.next;
        if (targetNode == null) {
            System.out.println("return 2");
            return;
        }
        leftNode.next = targetNode.next;

        Utils.printListNode(headNode);
    }

    public static void main(String[] args) {
        ListNode listNode = Utils.createOrderLinkedList();
        //1,2,3,4,5,6,7,8,9
        removeNode2(listNode, 0);
    }
}
