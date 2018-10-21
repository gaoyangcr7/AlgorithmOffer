package com.gaoyang.sort;

import com.gaoyang.Utils;

/**
 * Created by gaoyang on 2018/06/29.
 */
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {

        if (arr == null || left > right) {
            return;
        }

        int key = arr[left];
        int partition = partitionIt(arr, left, right, key);
        quickSort(arr, left, partition - 1);
        quickSort(arr, partition + 1, right);
    }

    public static int partitionIt(int[] arr, int left, int right, int key) {
        int initLeft = left;
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }

            while (i < j && arr[i] <= key) {
                i++;
            }

            Utils.swap(arr, i, j);

        }

        Utils.swap(arr, i, initLeft);

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 6, 1, 2, 7, 4};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};

        quickSort(arrList1, 0, arrList1.length - 1);
        Utils.printArr(arrList1);
    }


}
