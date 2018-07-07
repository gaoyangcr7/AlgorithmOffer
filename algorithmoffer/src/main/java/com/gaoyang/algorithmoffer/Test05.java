package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/06.
 * 第一版第4题
 */
//TODO
//把字符串的每个空格，替换成%20
public class Test05 {

    private static void replace(String str) {
        String result = str.replace(" ", "%20");

        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "We are happy";
        replace(str);
    }
}
