package com.guava.demo;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * @author created by wangyong on 17-12-4
 */
public class PreconditionTest {

    @Test
    public void checkNotNullTest() {
        String str = null;
        String checkNotNull = Preconditions.checkNotNull(str, "参数不可以为空");
        System.out.println(checkNotNull);
    }


    @Test
    public void checkArgumentTest() {
        int length = 5;
        Preconditions.checkArgument(length > 6, "length必须大于6");
    }




}
