package com.gaoyang.algorithmoffer;

import java.util.Map;

/**
 * Created by gaoyang on 2018/06/12.
 * 第一版第13题
 */
//在O(1)时间删除链表节点
public class Test18 {

    private static void removeNode2(ListNode headNode, ListNode targetNode) {
        if (headNode == null || targetNode == null) {
            return;
        }

        if (headNode.value == targetNode.value) {
            headNode = null;
        }

        ListNode nextNode = targetNode.next;
        ListNode currentNode = targetNode;

        if (nextNode != null) {
            //正常情况下
            currentNode.value = nextNode.value;
            currentNode.next = nextNode.next;
        } else {
            //当目标是最后一个节点的时候
            ListNode headerNode = headNode;
            ListNode previewNode = headerNode;
            while (headerNode != null) {

                if (headerNode.value == targetNode.value) {
                    previewNode.next = null;
                    break;
                }

                previewNode = headerNode;
                headerNode = headerNode.next;

            }
        }

        Utils.printListNode(headNode);

    }

    public static void main(String[] args) {
        Map<Integer, ListNode> map = Utils.createOrderLinkedList13();
        removeNode2(map.get(1), map.get(2));

    }
}
