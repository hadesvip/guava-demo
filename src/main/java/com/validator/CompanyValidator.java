package com.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import com.google.common.base.Strings;
import com.guava.domain.Company;

/**
 * 公司校验
 * @author: wangyong
 * @date: 2019/5/26 20:24
 */
public class CompanyValidator extends ValidatorHandler<Company> implements Validator<Company> {

	@Override
	public boolean validate(ValidatorContext context, Company company) {

		if (Strings.isNullOrEmpty(company.getName())) {
			context.addError(ValidationError.create("公司名不能为空").setErrorCode(201));
			return false;
		}


		return super.validate(context, company);
	}
}
