package com.guava.demo;

import com.google.common.base.Objects;
import org.junit.Test;

/**
 * @author created by wangyong on 17-12-4
 */
public class ObjectsTest {

    @Test
    public void equalTest() {
        System.out.println(Objects.equal("a", "a"));

        System.out.println(Objects.equal(null, "a"));
    }
}
