package com.bean.dto;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/1 21:34
 */
public class CarDto implements Serializable {

	private static final long serialVersionUID = 5110885158109218384L;
	private String make;
	private int seatCount;
	private String type;

	public String getMake() {
		return make;
	}

	public CarDto setMake(String make) {
		this.make = make;
		return this;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public CarDto setSeatCount(int seatCount) {
		this.seatCount = seatCount;
		return this;
	}

	public String getType() {
		return type;
	}

	public CarDto setType(String type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("make", make).add("seatCount", seatCount).add("type", type)
				.toString();
	}
}
