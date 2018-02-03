package com.pattern.abstractfactory1;

public class TwoWheelerFactory extends VechileFactory {

	@Override
	public Vechile getVechile(String type) {
		if ("honda".equalsIgnoreCase(type)) {
			return new HondaByke();
		} else if ("hero".equalsIgnoreCase(type)) {
			return new HeroByke();
		} else {
			return null;
		}
	}
	
}