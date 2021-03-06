package com.bean.po;

import com.google.common.base.MoreObjects;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/2 20:28
 */
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("name", name).toString();
	}
}
