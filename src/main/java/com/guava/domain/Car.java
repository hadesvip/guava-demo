package com.guava.domain;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 汽车
 * @author: wangyong
 * @date: 2019/5/26 17:31
 */
public class Car implements Serializable {

	private static final long serialVersionUID = 1312187452410022199L;

	/**
	 * 汽车名
	 */
	private String name;

	/**
	 * 牌照
	 */
	private String license;


	public String getName() {
		return name;
	}

	public Car setName(String name) {
		this.name = name;
		return this;
	}

	public String getLicense() {
		return license;
	}

	public Car setLicense(String license) {
		this.license = license;
		return this;
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("name", name).add("license", license).toString();
	}
}
