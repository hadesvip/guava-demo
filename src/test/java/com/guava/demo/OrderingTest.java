package com.guava.demo;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.guava.domain.User;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/**
 * guava中的比较器
 *
 * @author created by wangyong on 18-1-4
 */
public class OrderingTest {


    @Test
    public void orderingTest() {
        //自然排序：数字按大小排序，日期按先后排序
        Ordering<String> natural = Ordering.natural();

        List<String> stringList = natural.sortedCopy(Arrays.asList("b", "a", "c"));
        stringList.forEach(System.out::println);


        User admin = new User();
        admin
                .setName("admin")
                .setAge(23);
        User zhangsan = new User();
        zhangsan
                .setAge(25)
                .setName("张三");

        User lisi = new User();
        lisi.setName(null).setAge(27);

        User wangwu = new User();
        wangwu
                .setAge(25)
                .setName("张三");

//        Ordering<User> userOrdering = new Ordering<User>() {
//            @Override
//            public int compare(@Nullable User left, @Nullable User right) {
//                return Integer.compare(left.getAge(), right.getAge());
//            }
//        };


        //使用User的name作为排序基准
        Ordering<User> userOrdering = Ordering.natural().nullsFirst().onResultOf(new Function<User, String>() {
            @Nullable
            @Override
            public String apply(@Nullable User input) {
                return input.getName();
            }
        });


        List<User> userList = Arrays.asList(admin, zhangsan, lisi, wangwu);

        List<User> sortList = userOrdering.sortedCopy(userList);
        sortList.forEach(System.out::println);

        System.out.println("--------------------------");
        userOrdering.reverse().sortedCopy(userList).forEach(System.out::println);

        System.out.println("---------------------");
        //返回两个user,最大的那个
        User max = userOrdering.max(admin, wangwu);
        System.out.println(max);


    }


}
