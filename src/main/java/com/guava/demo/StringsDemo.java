package com.guava.demo;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangyong on 2017/11/25.
 */
public class StringsDemo {

    public static void main(String[] args) {

        //拼接字符
        List<String> strList = Arrays.asList("a", "b", "c", null);
        String joinStr = Joiner.on(",").skipNulls().join(strList);
        System.out.println(joinStr);

        //分割字符
        List<String> strings = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(joinStr);
        for (String str : strings) {
            System.out.println(str);
        }


        String str = "";

        if (Strings.isNullOrEmpty(str)) {
            System.out.println("空字符串...");
        }


    }
}
