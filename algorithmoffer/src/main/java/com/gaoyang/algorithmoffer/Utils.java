package com.gaoyang.algorithmoffer;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoyang on 2018/06/06.
 */
public class Utils {

    public static ListNode createOrderLinkedList() {
        ListNode linkedNode10 = new ListNode(10);
        ListNode linkedNode9 = new ListNode(9, linkedNode10);
        ListNode linkedNode8 = new ListNode(8, linkedNode9);
        ListNode linkedNode7 = new ListNode(7, linkedNode8);
        ListNode linkedNode6 = new ListNode(6, linkedNode7);
        ListNode linkedNode5 = new ListNode(5, linkedNode6);
        ListNode linkedNode4 = new ListNode(4, linkedNode5);
        ListNode linkedNode3 = new ListNode(3, linkedNode4);
        ListNode linkedNode2 = new ListNode(2, linkedNode3);
        ListNode linkedNode1 = new ListNode(1, linkedNode2);
        return linkedNode1;
    }

    public static Map<Integer, ListNode> createOrderLinkedList13() {

        ListNode linkedNode10 = new ListNode(10);
        ListNode linkedNode9 = new ListNode(9, linkedNode10);
        ListNode linkedNode8 = new ListNode(8, linkedNode9);
        ListNode linkedNode7 = new ListNode(7, linkedNode8);
        ListNode linkedNode6 = new ListNode(6, linkedNode7);
        ListNode linkedNode5 = new ListNode(5, linkedNode6);
        ListNode linkedNode4 = new ListNode(4, linkedNode5);
        ListNode linkedNode3 = new ListNode(3, linkedNode4);
        ListNode linkedNode2 = new ListNode(2, linkedNode3);
        ListNode linkedNode1 = new ListNode(1, linkedNode2);
        Map<Integer, ListNode> map = new HashMap();
        map.put(1, linkedNode1);
        map.put(2, linkedNode5);
        return map;
    }

    public static void printListNode(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        System.out.println("~~~~~~~~~~~~~~~PRINT START~~~~~~~~~~~~~~~");
        ListNode listNode1 = listNode;
        while (listNode1 != null) {
            System.out.println(listNode1.value);
            listNode1 = listNode1.next;
        }
        System.out.println("~~~~~~~~~~~~~~~PRINT END~~~~~~~~~~~~~~~");
    }

    public static void swap(int arr[], int firstIndex, int secondIndex) {
        if (arr == null) {
            return;
        }

        if (firstIndex == secondIndex) {
            return;
        }

        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;

    }
}
