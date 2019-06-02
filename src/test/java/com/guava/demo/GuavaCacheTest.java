package com.guava.demo;

import com.google.common.cache.CacheLoader;
import com.guava.domain.User;
import org.junit.Test;

/**
 * guava cache测试
 *
 * @author: wangyong
 * @date: 2018/11/1 22:38
 */
public class GuavaCacheTest {


  @Test
  public void loadNullValueTest() {

    CacheLoader<String, User> userCacheLoader = CacheLoader
        .from(str -> str.equals("") ? null : new User());





  }

}
