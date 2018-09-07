package com.gaoyang.sort;

import com.gaoyang.Utils;

public class BubbleSort {

    private static void sort(int[] arrList) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        for (int i = 0; i < arrList.length; i++) {
            for (int j = 0; j < arrList.length - i - 1; j++) {
                if (arrList[j] > arrList[j + 1]) {
                    Utils.swap(arrList, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrList[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};
        int arrList2[] = {1, 0, 3, 4, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

        sort(arrList);

        Utils.printArr(arrList);

    }

}
