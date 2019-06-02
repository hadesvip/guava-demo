package com.guava.domain;

import com.baidu.unbiz.fluentvalidator.annotation.FluentValidate;
import com.validator.CompanyValidator;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 公司
 * @author: wangyong
 * @date: 2019/5/26 20:14
 */
public class Company implements Serializable {


	private static final long serialVersionUID = -2727991857119391906L;

	@NotNull(message = "id不能为空")
	@FluentValidate({CompanyValidator.class})
	private String id;

	@NotNull(message = "公司名不能为空")
	private String name;

	@NotNull(message = "地址不能为空")
	private String address;


	public String getId() {
		return id;
	}

	public Company setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Company setName(String name) {
		this.name = name;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Company setAddress(String address) {
		this.address = address;
		return this;
	}
}
