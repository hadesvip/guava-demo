package com.bean.po;

import com.bean.consts.CarType;

import java.io.Serializable;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/1 21:36
 */
public class Car implements Serializable {

	private static final long serialVersionUID = 1392407002907510658L;

	private String make;
	private int numberOfSeats;
	private CarType type;

	public String getMake() {
		return make;
	}

	public Car setMake(String make) {
		this.make = make;
		return this;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public Car setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
		return this;
	}

	public CarType getType() {
		return type;
	}

	public Car setType(CarType type) {
		this.type = type;
		return this;
	}

	public Car(String make, int numberOfSeats, CarType type) {
		this.make = make;
		this.numberOfSeats = numberOfSeats;
		this.type = type;
	}

	public Car() {
	}
}

