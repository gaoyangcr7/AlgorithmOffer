package com.gaoyang.algorithmoffer;

import java.util.Stack;

/**
 * Created by gaoyang on 2018/06/06.
 */
//从尾到头打印链表
public class Test05 {

    private static void printLinkedList(ListNode linkedNode) {
        if (linkedNode == null) {
            return;
        }
        if (linkedNode.next == null) {
            System.out.println(linkedNode.value);
        }


        Stack<ListNode> stack = new Stack<>();
        stack.push(linkedNode);
        while (linkedNode.next != null) {
            linkedNode = linkedNode.next;
            stack.push(linkedNode);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().value);
        }
    }

    public static void main(String[] args) {

        printLinkedList(Utils.createOrderLinkedList());
    }
}
