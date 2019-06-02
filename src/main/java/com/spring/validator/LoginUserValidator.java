package com.spring.validator;

import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import com.spring.domain.LoginUser;
import org.springframework.stereotype.Component;

/**
 * 用户验证器
 * @author: wangyong
 * @date: 2019/5/26 21:26
 */
@Component
public class LoginUserValidator extends ValidatorHandler<LoginUser> implements Validator<LoginUser> {


	@Override
	public boolean validate(ValidatorContext context, LoginUser loginUser) {

		System.out.println(loginUser);
		return super.validate(context, loginUser);
	}
}
