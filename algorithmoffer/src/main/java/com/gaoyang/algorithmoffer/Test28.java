package com.gaoyang.algorithmoffer;

/**
 * Created by gaoyang on 2018/06/29.
 * 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列
 * 如：输入字符串abc。要打出来abc, acb, bac, bca, cab, cba
 */
public class Test28 {

    private static void permutation(char[] s) {
        if (s == null) {
            return;
        }

        permutation(s, 0);

    }

    private static void permutation(char[] s, int begin) {

        if (begin == s.length) {
            System.out.println(s);
        } else {
            for (int i = 0; i < s.length; i++) {
                char tmp = s[begin];
                s[begin] = s[i];
                s[i] = tmp;

                permutation(s, begin + 1);

                tmp = s[begin];
                s[begin] = s[i];
                s[i] = tmp;
            }
        }


    }

    public static void main(String[] args) {
        char[] str = {'a', 'b'};

        permutation(str);
    }
}
