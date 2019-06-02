package com.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import com.google.common.base.Strings;

/**
 * 汽车牌照校验
 * @author: wangyong
 * @date: 2019/5/26 18:23
 */
public class CarLicenseValidator extends ValidatorHandler<String> implements Validator<String> {


	@Override
	public boolean validate(ValidatorContext context, String license) {

		System.out.println(context.getAttribute("name"));

		if (Strings.isNullOrEmpty(license)) {
			context.addError(ValidationError.create("汽车拍照为空").setErrorCode(202));
		}

		return super.validate(context, license);
	}
}
