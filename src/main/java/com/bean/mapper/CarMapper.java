package com.bean.mapper;

import com.bean.dto.CarDto;
import com.bean.po.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * car对象转换
 * @author: wangyong
 * @date: 2019/6/1 23:23
 */
@Mapper
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto convertDto(Car car);
}
