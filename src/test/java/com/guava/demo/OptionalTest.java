package com.guava.demo;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;
import java.util.function.Supplier;

/**
 * 用于防止null的出现
 *
 * @author created by wangyong on 17-12-5
 */
public class OptionalTest {

    @Test
    public void optionalTest() {

//        List<String> list = null;
//
//        list = Lists.newArrayList();
//        list.add("optional");
//        list.add("arrayList");
//
//
//        Optional<List<String>> strListOptional = Optional.of(list);
//        if (strListOptional.isPresent()) {
//            System.out.println(strListOptional.get());
//        }

        //引用不为空对象
        Optional<Integer> integerOptional = Optional.of(5);
        if (integerOptional.isPresent()) {
            System.out.println(integerOptional.get());
        }

        //引用可以为空的
        Optional<Integer> nullOptional = Optional.fromNullable(null);
        System.out.println(nullOptional.isPresent());

        //构造空值的optional
        Optional<Integer> objectOptional = Optional.absent();
        //为空，返回默认值
        Integer integer = objectOptional.or(5);
        System.out.println(integer);

        //为空返回一个新的optional
        Optional<Integer> secondOptional = objectOptional.or(Optional.of(10));
        if (secondOptional.isPresent()) {
            System.out.println(secondOptional.get());
        }

        Integer supplierOptional = objectOptional.or(() -> 90);
        System.out.println(supplierOptional);

        System.out.println("--------------------------------------");
        Set<Integer> integerSet = objectOptional.asSet();
        Set<Integer> newIntegerSet = Sets.newHashSet(integerSet);
        newIntegerSet.add(10);
        newIntegerSet.add(30);

        newIntegerSet.forEach(System.out::println);

        Optional<Set<Integer>> setOptional = Optional.of(newIntegerSet);
        if (setOptional.isPresent()) {
            System.out.println(setOptional.get());
        }
        System.out.println("-------------------------------------");
        Set<Integer> integers = secondOptional.asSet();
        integers.forEach(System.out::println);
    }


    @Test
    public void stringsOptionalSupportTest() {
        String emptyToNull = Strings.emptyToNull("");
        System.out.println(emptyToNull);

        String nullToEmpty = Strings.nullToEmpty(null);
        System.out.println(nullToEmpty);


    }
}
