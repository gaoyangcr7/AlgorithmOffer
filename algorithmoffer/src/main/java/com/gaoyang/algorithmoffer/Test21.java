package com.gaoyang.algorithmoffer;

import com.gaoyang.Utils;

/**
 * Created by gaoyang on 2018/06/13.
 * 第一版第14题
 */

//调整数组顺序使奇数位于偶数前面
public class Test21 {

    public static void reorder(int arr[]) {

        int front = 0;
        int back = arr.length - 1;

        int count = 0;
//        while (front != back) {
//            count++;
//            if (arr[front] % 2 == 0) {
//                Utils.swap(arr, front, back);
//                back--;
//            } else {
//                Utils.swap(arr, front, back);
//                front++;
//            }
//        }

        while (front < back) {
            count++;
            while (front < back && arr[front] % 2 != 0) {
                front++;
            }
            while (front < back && arr[back] % 2 == 0) {
                back--;
            }
            if (front < back) {
                Utils.swap(arr, front, back);
            }
        }


        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("count: " + count);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 8, 9, 1, 3, 5};

        reorder(arr);
    }
}
