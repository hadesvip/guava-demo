package com.validator;

import com.baidu.unbiz.fluentvalidator.*;
import com.google.common.base.Strings;
import com.guava.domain.Car;

import java.util.List;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/5/26 18:31
 */
public class CarValidator extends ValidatorHandler<Car> implements Validator<Car> {

	@Override
	public boolean validate(ValidatorContext context, Car car) {

		Closure<List<String>> carNameList = context.getClosure("carNameList");
		List<String> result = carNameList.executeAndGetResult();
		result.forEach(System.out::println);

		if (car == null) {
			context.addError(ValidationError.create("汽车对象为空").setErrorCode(201));
			return false;
		}

		if (Strings.isNullOrEmpty(car.getName())) {
			context.addError(ValidationError.create("汽车名为空").setErrorCode(201));
			return false;

		}

		if (Strings.isNullOrEmpty(car.getLicense())) {
			context.addError(ValidationError.create("汽车牌照为空").setErrorCode(201));
			return false;
		}

		return super.validate(context, car);
	}
}
