package com.gaoyang.sort;

import com.gaoyang.Utils;

public class SelectSort {

    private static void sort(int arrList[]) {

        int min = 0;
        for (int i = arrList.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrList[min] > arrList[j]) {
                    min = j;
                    break;
                }
            }
            Utils.swap(arrList, min, i);
        }
    }

    public static void main(String[] args) {
        int arrList[] = {4, 8, 1, 3, 5, 0, 8, 4, 7, 2, 6, 9};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};
        int arrList2[] = {1, 0, 3, 4, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};


        sort2(arrList);

        Utils.printArr(arrList);
    }

    private static void sort2(int[] arrList) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        for (int i = 0; i < arrList.length; i++) {
            int min = i;
            for (int j = i; j < arrList.length; j++) {
                if (arrList[j] < arrList[min]) {
                    min = j;
                }
            }

            Utils.swap(arrList, min, i);
        }
    }
}
