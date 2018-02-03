package com.pattern.abstractfactory1;

public class FourWheelerFactory extends VechileFactory {

	@Override
	public Vechile getVechile(String type) {
		if ("maruti".equalsIgnoreCase(type)) {
			return new MarutiCar();
		} else if ("tata".equalsIgnoreCase(type)) {
			return new TataCar();
		} else {
			return null;
		}
	}

}