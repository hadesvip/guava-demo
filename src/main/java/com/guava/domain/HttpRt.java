package com.guava.domain;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * http返回体
 * @author: wangyong
 * @date: 2019/5/26 18:00
 */
public class HttpRt implements Serializable {


	private static final long serialVersionUID = 11093709068633358L;

	/**
	 * 返回码
	 */
	private String code;

	/**
	 * 消息内容
	 */
	private String msg;

	public String getCode() {
		return code;
	}

	public HttpRt setCode(String code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public HttpRt setMsg(String msg) {
		this.msg = msg;
		return this;
	}


	public HttpRt() {
	}

	public HttpRt(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("code", code).add("msg", msg).toString();
	}
}
