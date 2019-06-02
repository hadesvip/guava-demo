package com.guava.demo;

import com.bean.consts.CarType;
import com.bean.dto.CarDto;
import com.bean.dto.PersonDto;
import com.bean.mapper.CarMapper;
import com.bean.mapper.PersonMapper;
import com.bean.po.Car;
import com.bean.po.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/1 23:23
 */
public class MapStructTest {


	@Test
	public void carMapperTest() {

		Car car = new Car("Morris", 5, CarType.SEDAN);

		CarDto carDTO = CarMapper.INSTANCE.convertDto(car);
		System.out.println(carDTO);
	}


	@Test
	public void personMapperTest() {
		List<Person> personList = Arrays
				.asList(new Person("admin"), new Person("zhangsan"), new Person("lisi"), new Person("wangwu"));

		List<PersonDto> personDtoList = PersonMapper.INSTANCE.convertDtoList(personList);
		personDtoList.forEach(System.out::println);


	}
}
