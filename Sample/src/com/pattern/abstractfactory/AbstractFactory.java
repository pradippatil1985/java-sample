package com.pattern.abstractfactory;

public class AbstractFactory {

	public SpeciesFactory getSpeciesFactory(String type) {
		if ("mammal".equalsIgnoreCase(type)) {
			return new MammalFactory();
		} else if("reptile".equalsIgnoreCase(type)) {
			return new ReptileFactory();
		} else {
			return null;
		}
	}

}
