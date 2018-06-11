package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/07.
 */

/**
 * 打印1到最大的n位数
 * 输入数字n，按顺序打印出从1最大的n位十进制数
 * 比如输入3，则打印出1，2，3到最大的3位数即999
 */

//TODO
public class Test12 {

    private static void print(int target) {
        int result = 1;
        for (int i = 1; i <= target; i++) {
            result = result * 10;
        }

        for (int i = 1; i < result; i++) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        print(3);
    }
}
