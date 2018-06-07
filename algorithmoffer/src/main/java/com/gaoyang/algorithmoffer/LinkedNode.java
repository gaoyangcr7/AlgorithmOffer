package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 */
public class LinkedNode {
    public LinkedNode(int value) {
        this.value = value;
    }

    public LinkedNode(int value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public int value;
    public LinkedNode next;
}
