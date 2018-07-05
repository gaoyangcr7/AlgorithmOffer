package com.gaoyang.algorithmoffer;

import com.gaoyang.sort.QuickSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyang on 2018/07/04.
 * 最小的K个数
 * 输入n个证书，找出最小的k个数
 * 输入4，5，1，6，2，7，3，8；则最小的4个数是1，2，3，4
 */
public class Test30 {
    //用快速排序，排序整个数组，然后前k个就是最小的k个数
    private static List<Integer> find(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k > arr.length || k <= 0) {
            return null;
        }

        QuickSort.quickSort(arr, 0, arr.length - 1);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    //改变数组顺序
    private static List<Integer> find2(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k > arr.length || k <= 0) {
            return null;
        }

        int key = arr[0];
        int index = QuickSort.partitionIt(arr, 0, arr.length - 1, key);

        while (index != k - 1) {
            if (index > k) {
                int end = index;
                index = QuickSort.partitionIt(arr, 0, end, arr[0]);
            }

            if (index < k) {
                int start = index;
                index = QuickSort.partitionIt(arr, start, arr.length - 1, arr[index]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    //适合海量数据
    private static List<Integer> find3(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k > arr.length || k <= 0) {
            return null;
        }
        List<Integer> result = new ArrayList<>();

        return result;
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 6, 2, 7, 3, 8};

        List<Integer> list = find2(arr, 4);
        if (list != null) {
            for (int a : list) {
                System.out.printf(a + ", ");
            }
        }
    }
}
