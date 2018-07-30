package com.gaoyang.sort;

import com.gaoyang.Utils;

public class InsertSort {

    private static void sort(int arrList[]) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        for (int i = 1; i < arrList.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (arrList[j] < arrList[j - 1]) {
                    Utils.swap(arrList, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrList[] = {4, 8, 1, 3, 5, 0, 8, 4, 7, 2, 6, 9};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};
        int arrList2[] = {1, 0, 3, 4, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

        sort2(arrList2);

        Utils.printArr(arrList2);
    }

    private static void sort2(int arrList[]) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        for (int i = 1; i < arrList.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrList[j] < arrList[j - 1]) {
                    Utils.swap(arrList, j, j - 1);
                }
            }
        }
    }
}
