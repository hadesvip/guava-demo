package com.guava.demo;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author created by wangyong on 18-1-3
 */
public class StringsTest {

    @Test
    public void joinTest() {
        //拼接字符
        List<String> strList = Arrays.asList("a", "b", "c", null);
        String joinStr = Joiner.on(",").skipNulls().join(strList);
        System.out.println(joinStr);
    }

    @Test
    public void splitTest() {

        String joinStr = "a,b,c";
        //分割字符
        List<String> strings = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(joinStr);
        for (String str : strings) {
            System.out.println(str);
        }
    }

    @Test
    public void stringsTest() {
        String str = "";

        if (Strings.isNullOrEmpty(str)) {
            System.out.println("空字符串...");
        }

    }
}
