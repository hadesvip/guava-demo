package com.guava.demo;

import com.bean.po.User;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * guava-cache测试
 * 对标concurrentMap
 * ConcurrentMap:一直保存添加得元素直到显示删除
 * Guava-Cache: 自动回收元素
 * 都属于本地缓存
 * @author: wangyong
 * @date: 2019/11/12 23:17
 */
public class GuavaCacheTests {

	LoadingCache<String, User> userCache = CacheBuilder.newBuilder().maximumSize(1000)
			.build(new CacheLoader<String, User>() {
				@Override
				public User load(String key) throws Exception {
					System.out.println("loading userCache by key:" + key);
					return new User(key, "admin", "admin@126.com");
				}
			});


	Cache<String, User> newUserCache = CacheBuilder.newBuilder().build();


	@Test
	public void cacheLoaderTest() throws ExecutionException {
		User user = userCache.get("1");
		System.out.println(user);

		user = userCache.get("1");
		System.out.println(user);
	}


	@Test
	public void cacheTest() throws ExecutionException {

		User user = newUserCache.getIfPresent("1");
		System.out.println(user);

		String key = "1";
		user = newUserCache.get(key, new Callable<User>() {
			@Override
			public User call() {
				System.out.println("初始化cache通过key:" + key);
				return new User(key, "admin", "admin@126.com");
			}
		});
		System.out.println(user);
	}


}
