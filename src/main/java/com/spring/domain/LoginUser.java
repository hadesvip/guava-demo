package com.spring.domain;

import com.baidu.unbiz.fluentvalidator.annotation.FluentValidate;
import com.google.common.base.MoreObjects;
import com.spring.validator.LoginUserValidator;

import java.io.Serializable;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/5/26 21:29
 */
public class LoginUser implements Serializable {

	private static final long serialVersionUID = 2400468810291305903L;

	/**
	 * 登录用户名
	 */
	@FluentValidate({LoginUserValidator.class})
	private String loginName;

	/**
	 * 登录密码
	 */
	private String loginPwd;

	public String getLoginName() {
		return loginName;
	}

	public LoginUser setLoginName(String loginName) {
		this.loginName = loginName;
		return this;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public LoginUser setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
		return this;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("loginName", loginName).add("loginPwd", loginPwd).toString();
	}
}
