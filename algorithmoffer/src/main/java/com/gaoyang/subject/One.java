package com.gaoyang.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyang on 2018/08/10.
 */
public class One {

    private static void print(int[] arrList, int target) {
        if (arrList == null || arrList.length == 0) {
            return;
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < arrList.length - 1; i++) {
            for (int j = i + 1; j < arrList.length; j++) {
                if (arrList[i] + arrList[j] == target) {
                    int[] arr = {arrList[i], arrList[j]};
                    list.add(arr);
                }
            }
        }

        for (int[] arr : list) {
            System.out.println(arr[0] + ", " + arr[1]);
        }
    }

    private static void print2() {


    }

    public static void main(String[] args) {

        int arrList[] = {1, 3, 6, 4, 2, 7};

        int target = 7;

        print(arrList, target);
    }


}
