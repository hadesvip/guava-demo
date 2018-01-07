package com.guava.demo;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * 不可变集合
 *
 * @author created by wangyong on 18-1-4
 */
public class ImmutableSetTest {


    @Test
    public void immutableSetTest() {
        Set<String> strSet = Sets.newHashSet();
        strSet.add("JAVA");
        strSet.add("python");
        strSet.add("shell");

        //不可变集合可以通过copyOf,和builder构建
        ImmutableSet<String> strImmutableSet = ImmutableSet.copyOf(strSet);
//        strImmutableSet

        ImmutableSet<String> immutableSet = ImmutableSet.<String>builder()
                .add("java")
                .add("python")
                .add("shell")
                .build();

        ImmutableList<String> strImmutableList = immutableSet.asList();
        strImmutableList.forEach(System.out::println);


    }

    /**
     * 带有排序的不可变集合
     */
    @Test
    public void sortedMutisetTest() {
        ImmutableSortedMultiset immutableSortedMultiset = ImmutableSortedMultiset.copyOf(Arrays.asList("b", "a", "c"));
        ImmutableList immutableList = immutableSortedMultiset.asList();
        immutableList.forEach(System.out::println);


        System.out.println("-----------------------------------------------------");
        ImmutableSortedMultiset<String> strImmutableSortedMultiset =
                ImmutableSortedMultiset.<String>naturalOrder()
                        .add("b")
                        .add("a")
                        .add("c")
                        .build();
        ImmutableList<String> strImmutableList = strImmutableSortedMultiset.asList();
        strImmutableList.forEach(System.out::println);

        System.out.println("------------------------------------------");
        List<String> stringList = Lists.newArrayList(strImmutableList);
        stringList.forEach(System.out::println);
    }


}
