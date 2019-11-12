package com.bean.po;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 用户
 * @author: wangyong
 * @date: 2019/11/12 23:29
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1429890138148595430L;

	/**
	 * 用户Id
	 */
	private String userId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 邮件
	 */
	private String email;

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public User(String userId, String userName, String email) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("userId", userId).add("userName", userName).add("email", email)
				.toString();
	}
}
