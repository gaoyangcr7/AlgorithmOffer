package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 */
public class Utils {

    public static LinkedNode createOrderLinkedList() {
        LinkedNode linkedNode10 = new LinkedNode(10);
        LinkedNode linkedNode9 = new LinkedNode(9, linkedNode10);
        LinkedNode linkedNode8 = new LinkedNode(8, linkedNode9);
        LinkedNode linkedNode7 = new LinkedNode(7, linkedNode8);
        LinkedNode linkedNode6 = new LinkedNode(6, linkedNode7);
        LinkedNode linkedNode5 = new LinkedNode(5, linkedNode6);
        LinkedNode linkedNode4 = new LinkedNode(4, linkedNode5);
        LinkedNode linkedNode3 = new LinkedNode(3, linkedNode4);
        LinkedNode linkedNode2 = new LinkedNode(2, linkedNode3);
        LinkedNode linkedNode1 = new LinkedNode(1, linkedNode2);
        return linkedNode1;
    }
}
