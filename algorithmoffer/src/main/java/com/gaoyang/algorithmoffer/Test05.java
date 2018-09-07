package com.gaoyang.algorithmoffer;

import java.util.Arrays;

/**
 * Created by gaoyang on 2018/06/06.
 * 第一版第4题
 */
//把字符串的每个空格，替换成%20
public class Test05 {

    private static void replace(char[] str, String replaceStr) {
        if (str == null || str.length == 0) {
            return;
        }

        int spaceCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        System.out.println("spaceCount = " + spaceCount);


//        int oldLength = str.length-1;
//        int newLength = oldLength + (replaceStr.length() - 1) * spaceCount+1;
        int oldLength = str.length;
        int newLength = oldLength + (replaceStr.length() - 1) * spaceCount;

        int oldIndex = oldLength - 1;
        int newIndex = newLength - 1;

        char[] newString = new char[newLength];
        for (int i = 0; i < str.length; i++) {
            newString[i] = str[i];
        }
        while (oldIndex >= 0 && oldIndex != newIndex) {
            if (str[oldIndex] == ' ') {
                newString[newIndex--] = '0';
                newString[newIndex--] = '2';
                newString[newIndex--] = '%';
            } else {
                newString[newIndex--] = newString[oldIndex];
            }

            oldIndex--;
        }

        System.out.println("newString = " + Arrays.toString(newString));
    }

    public static void main(String[] args) {
        String str = "We are happy";
        char[] chars = {'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y'};
        replace(chars, "%20");
    }
}
