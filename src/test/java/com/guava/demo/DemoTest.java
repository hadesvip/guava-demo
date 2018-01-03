package com.guava.demo;

import com.google.common.collect.Lists;
import com.guava.domain.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author created by wangyong on 17-12-11
 */
public class DemoTest {


    @Test
    public void doubleTest() {
//        Double num = 2.50;
//
//        int intvalue = num.intValue();
//
//        System.out.println(intvalue);
//
//        int num2 = (int) ((num % intvalue) * 100);
//        System.out.println(num2);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        integers.forEach(integer -> System.out.println(integer));

        System.out.println("--------------");
        integers.forEach(System.out::println);

    }

    @Test
    public void lambdaTest() {

        List<User> userList = Lists.newArrayList(Arrays.asList(new User("amdin", 12), new User("zhangsan", 25)));

        long count = userList.stream().filter(user -> user.getAge() < 20).count();
        if (count > 0) {
            System.out.println(count);
        }
    }

    @Test
    public void flagTest() {
        String msg = "";

        boolean flag = true;
        msg = flag ? "40209" : "";
        System.out.println(msg);
    }

}
