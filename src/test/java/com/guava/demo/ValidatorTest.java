package com.guava.demo;

import com.AppConfig;
import com.baidu.unbiz.fluentvalidator.*;
import com.baidu.unbiz.fluentvalidator.exception.RuntimeValidateException;
import com.baidu.unbiz.fluentvalidator.jsr303.HibernateSupportedValidator;
import com.baidu.unbiz.fluentvalidator.registry.impl.SimpleRegistry;
import com.baidu.unbiz.fluentvalidator.registry.impl.SpringApplicationContextRegistry;
import com.google.common.collect.Lists;
import com.guava.domain.Car;
import com.guava.domain.Company;
import com.guava.domain.HttpRt;
import com.handler.RtHandler;
import com.spring.domain.LoginUser;
import com.spring.validator.LoginUserValidator;
import com.validator.CarLicenseValidator;
import com.validator.CarNameValidator;
import com.validator.CarValidator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;

/**
 * 校验器测试
 * @author: wangyong
 * @date: 2019/5/26 17:38
 */
public class ValidatorTest {

	@Test
	public void carTest() {
		Car car = new Car();
		car.setName("bwm");
		HttpRt result = FluentValidator.checkAll().on(car.getName(), new CarNameValidator())
				.on(car.getLicense(), new CarLicenseValidator()).doValidate().result(new RtHandler());
		System.out.println(result);


	}

	@Test
	public void chainTest() {
		try {
			Car car = null;
			ValidatorChain chain = new ValidatorChain();
			chain.setValidators(Lists.newArrayList(new CarValidator()));
			HttpRt httpRt = FluentValidator.checkAll().failFast().on(car, chain).doValidate().result(new RtHandler());
			System.out.println(httpRt);
		} catch (RuntimeValidateException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void closeureTest() {
		Closure<List<String>> listClosure = new ClosureHandler<List<String>>() {
			List<String> carNameList = null;

			@Override
			public List<String> getResult() {
				return carNameList;
			}

			@Override
			public void doExecute(Object... input) {
				carNameList = Arrays.asList("bwm", "audi", "Mercedes-Benz");
			}
		};

		Car car = new Car();
		FluentValidator.checkAll().putClosure2Context("carNameList", listClosure).on(car, new CarValidator())
				.doValidate().result(new RtHandler());
	}


	@Test
	public void integrateHibernateTest() {
		Company company = new Company();

		Locale.setDefault(Locale.CHINESE);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();


		HttpRt result = FluentValidator.checkAll()
				.on(company, new HibernateSupportedValidator<>().setHiberanteValidator(validator)).doValidate()
				.result(new RtHandler());
		System.out.println(result);
	}


	@Test
	public void annotationTest() {
		Company company = new Company();
		company.setName("1");

		Result result = FluentValidator.checkAll().configure(new SimpleRegistry()).on(company).doValidate()
				.result(toSimple());

		System.out.println(result);
	}


	@Test
	public void integrateSpringTest() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		LoginUserValidator loginUserValidator = ctx.getBean(LoginUserValidator.class);

		LoginUser loginUser = new LoginUser();
		loginUser.setLoginName("admin");

		HttpRt result = FluentValidator.checkAll().on(loginUser, loginUserValidator).doValidate()
				.result(new RtHandler());
		System.out.println(result);
	}


}
