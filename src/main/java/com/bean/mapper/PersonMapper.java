package com.bean.mapper;

import com.bean.dto.PersonDto;
import com.bean.po.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/2 20:33
 */
@Mapper
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);


	PersonDto convertDto(Person person);


	List<PersonDto> convertDtoList(List<Person> PersonList);


}
