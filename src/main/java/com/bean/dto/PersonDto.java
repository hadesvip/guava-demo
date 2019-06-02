package com.bean.dto;

import com.google.common.base.MoreObjects;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/2 20:35
 */
public class PersonDto {

	private String name;


	public String getName() {
		return name;
	}

	public PersonDto setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("name", name).toString();
	}
}
