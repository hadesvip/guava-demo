package com.guava.demo;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * 用于防止null的出现
 *
 * @author created by wangyong on 17-12-5
 */
public class OptionalTest {

    @Test
    public void optionalTest() {

        List<String> list = null;

        list = Lists.newArrayList();
        list.add("optional");
        list.add("arrayList");


        Optional<List<String>> strListOptional = Optional.of(list);
        if (strListOptional.isPresent()) {
            System.out.println(strListOptional.get());
        }


    }
}
