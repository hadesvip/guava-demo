package com.guava.demo;

import com.google.common.collect.Lists;
import com.guava.domain.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
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

    @Test
    public void compareTest() {
        User userOne = new User();
        userOne.setName("张三").setAge(23);
        User userTwo = new User();
        userTwo.setName("李四").setAge(25);

        int compare = userOne.compareTo(userTwo);
        System.out.println(compare);

        List<User> userList = Lists.newLinkedList(Arrays.asList(userOne, userTwo));
        userList.forEach(System.out::println);


        //可以用于FIFO和LiFO队列
        LinkedList<Integer> linkedList = Lists.newLinkedList();
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.add(6);

        System.out.println(linkedList);
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.pop());
        System.out.println(linkedList.poll());
        linkedList.push(7);
        System.out.println(linkedList);
    }


    @Test
    public void identityArrayListTest() {
//        IdentityArrayList identityArrayList = new IdentityArrayList();



    }

}
