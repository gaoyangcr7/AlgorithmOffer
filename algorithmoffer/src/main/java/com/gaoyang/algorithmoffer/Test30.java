package com.gaoyang.algorithmoffer;

import java.util.Stack;

/**
 * Created by gaoyang on 2018/06/27.
 * 第一版第21题
 * 包含min函数的栈
 * 实现一个能够得到栈的 最小元素的min函数。
 * 在该栈中，调用min、push、pop的时间复杂度都是O(1)
 */
public class Test30 {


    public static void main(String[] args) {

    }

    private static void createStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(5);
        stack.push(7);
        stack.push(8);
    }
}
