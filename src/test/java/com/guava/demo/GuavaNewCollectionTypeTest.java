package com.guava.demo;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * guava中新的集合类型
 *
 * @author created by wangyong on 18-1-5
 */
public class GuavaNewCollectionTypeTest {


    /**
     * Multiset可以添加重复的元素
     */
    @Test
    public void multiSetTest() {
        HashMultiset<String> strHashMultiSet = HashMultiset.create();
        strHashMultiSet.add("a");
        strHashMultiSet.add("b");
        strHashMultiSet.add("c");
        strHashMultiSet.add("a");
        strHashMultiSet.add("b");
        strHashMultiSet.add("b");

        //存储指定元素的个数
        int count = strHashMultiSet.count("b");
        System.out.println(count);

        //存储元素的个数，包括重复的元素
        int size = strHashMultiSet.size();
        System.out.println(size);

        //返回迭代器，包括重复的元素
        Iterator<String> iterator = strHashMultiSet.iterator();
        iterator.forEachRemaining(System.out::println);

        System.out.println("---------------------------------");

        //返回不重复的元素集合
        Set<String> elementSet = strHashMultiSet.elementSet();
        System.out.println(elementSet.size());
        elementSet.forEach(System.out::println);


        System.out.println("------------------------------------");
        strHashMultiSet.removeIf(str -> str.equals("a"));
        strHashMultiSet.iterator().forEachRemaining(System.out::println);

        //增加计数
        strHashMultiSet.add("a", 10);
        System.out.println(strHashMultiSet.count("a"));

        strHashMultiSet.remove("a", 2);
        System.out.println(strHashMultiSet.count("a"));

    }


    /**
     * 获取某个范围
     */
    @Test
    public void sortedMultisetTest() {
        TreeMultiset<String> stringTreeMultiset = TreeMultiset.create();
        stringTreeMultiset.add("1");
        stringTreeMultiset.add("2");
        stringTreeMultiset.add("3");
        stringTreeMultiset.add("4");
        stringTreeMultiset.add("5");

        SortedMultiset<String> stringSortedMultiset = stringTreeMultiset.<String>subMultiset("1", BoundType.CLOSED, "4", BoundType.CLOSED);
        stringSortedMultiset.forEach(System.out::println);



//        int size = stringTreeMultiset.subMultiset("1", BoundType.OPEN, "4", BoundType.CLOSED).size();
//        System.out.println(size);


    }



    @Test
    public void multiMapTest() {
//        ArrayListMultimap<String>


    }




}
