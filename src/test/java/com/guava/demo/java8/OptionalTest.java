package com.guava.demo.java8;

import com.bean.po.Person;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * 防止空指针
 * @author: wangyong
 * @date: 2019/6/20 22:53
 */
public class OptionalTest {


	@Test
	public void optionalTest() {

		getPersonList().ifPresent(System.out::println);



	}


	Optional<List<Person>> getPersonList() {
		//执行查询数据库或者调用服务
		List<Person> personList = null;

		personList = Lists.newArrayList();

		personList.add(new Person("张三"));

		return Optional.ofNullable(personList);

	}


}
