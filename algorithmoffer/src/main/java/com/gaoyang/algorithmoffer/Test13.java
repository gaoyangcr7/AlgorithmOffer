package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/12.
 */
//在O(1)时间删除链表节点
public class Test13 {

    private static void removeNode(ListNode listNode, int target) {
        if (target < 0) {
            return;
        }

        ListNode node = listNode;
        ListNode previewNode = listNode;
        while (node != null) {
            if (node.value == target) {
                previewNode.next = node.next;
                System.out.println("find target "+target);
                Utils.printListNode(listNode);
                return;
            }
            previewNode = node;
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ListNode listNode = Utils.createOrderLinkedList();

        removeNode(listNode, 5);
    }
}
