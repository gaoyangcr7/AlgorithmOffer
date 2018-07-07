package com.gaoyang.algorithmoffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gaoyang on 2018/07/05.
 * 第一版第35题
 * 第一个只出现一次的字符
 */
public class Test50 {

    private static char find(String str) {
        char result = 0;
        if (str == null || str.length() == 0) {
            return result;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int count = map.get(a) == null ? 0 : map.get(a);
            map.put(a, ++count);
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> tmp : set) {
            if (tmp.getValue() == 1) {
                return tmp.getKey();
            }
        }

        return result;
    }

    private static char find2(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            Integer count = map.get(tmp);
            count = count == null ? 0 : count;
            map.put(tmp, ++count);
        }

        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for (Map.Entry<Character, Integer> tmp : entry) {
            if (tmp.getValue() == 1) {
                return tmp.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String str = "abaccdeff";
        char result = find2(str);
        System.out.println(String.valueOf(result));
    }
}
