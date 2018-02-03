package com.pattern.abstractfactory1;

public class AbstractFactory {

	public VechileFactory getVechileFactory(String type) {
		if ("two".equalsIgnoreCase(type)) {
			return new TwoWheelerFactory();
		} else if("four".equalsIgnoreCase(type)) {
			return new FourWheelerFactory();
		} else {
			return null;
		}
	}

}
