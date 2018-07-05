package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/29.
 * 数组中出现次数超过一半的数字
 */
public class Test29 {

    private static int find(int arr[]) {
        if (arr == null || arr.length <= 0) {
            return -1;
        }

        int tmpResult = arr[0];
        int times = 1;
        for (int i = 1; i < arr.length; i++) {
            if (times == 0) {
                tmpResult = arr[i];
                times = 1;
            } else {
                if (arr[i] == tmpResult) {
                    times++;
                } else {
                    times--;
                }
            }
        }

        return tmpResult;
    }

    private static boolean checkMoreThanHalf(int[] arr, int number) {
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                times++;
            }
        }

        System.out.println(times);
        if (times * 2 < arr.length) {
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {

        int[] arr1 = {0, 1, 1, 2, 3, 1};
        int[] arr = {2, 45, 6, 5, 3, 1, 45, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 546, 1, 445, 4, 4, 1, 6, 4, 3, 1, 2, 1, 6, 77, 8, 99, 0, 3, 2, 2, 56, 1};
        int result = find(arr);
        System.out.println("result = " + result + ", right ? " + checkMoreThanHalf(arr, result));
    }
}
