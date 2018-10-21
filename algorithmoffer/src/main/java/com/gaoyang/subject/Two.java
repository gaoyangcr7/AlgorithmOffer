package com.gaoyang.subject;

/**
 * Created by gaoyang on 2018/08/14.
 * 有一个整形数组，包含正数和负数，然后要求把数组内的所有负数移至正数的左边，
 * 且保证相对位置不变，要求时间复杂度为O(n), 空间复杂度为O(1)。
 * 例如，{10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35}
 * 变化后是
 * {-2, -4，-3, -88, -23,5, 8 ,10, 2, 7, 12, 35}。
 */
public class Two {

    private static void sort(int arr[]) {
        if (arr == null || arr.length < 1) {
            return;
        }

        int point = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                swap(arr, point, i);
                point++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + " ");
        }
    }

    private static void sort2(int arr[]) {
        if (arr == null || arr.length < 1) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            if (arr[left] < 0) {
                left++;
            }

            if (arr[right] > 0) {
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + " ");
        }
    }

    private static void swap(int arr[], int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static void main(String[] args) {
        int arrList[] = {10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35};
        sort(arrList);
        System.out.println("");
        sort2(arrList);
    }
}
