package com.guava.demo;

import com.google.common.base.Optional;

/**
 * Optional非空值
 *
 * @author created by wangyong on 17-12-4
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<Integer> integerOptional = Optional.of(6);
        if (integerOptional.isPresent()) {
            System.out.println("possible isPresent:" + integerOptional.isPresent());
            System.out.println("possible value:" + integerOptional.get());
        }


        Optional<Integer> absentOptional = Optional.absent();

        if (absentOptional.isPresent()) {
            System.out.println(absentOptional.get());
        }


    }

}
