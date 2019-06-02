package com.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import com.google.common.base.Strings;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/5/26 17:34
 */
public class CarNameValidator extends ValidatorHandler<String> implements Validator<String> {

	@Override
	public boolean validate(ValidatorContext context, String name) {

		context.setAttribute("name", name);

		if (Strings.isNullOrEmpty(name)) {
			//			context.addErrorMsg("汽车名为空");
			context.addError(ValidationError.
					create("汽车名为空").setErrorCode(201));
		}


		return super.validate(context, name);
	}


}
