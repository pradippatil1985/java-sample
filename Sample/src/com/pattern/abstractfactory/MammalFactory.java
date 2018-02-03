package com.pattern.abstractfactory;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equalsIgnoreCase(type)) {
			return new Dog();
		} else if ("cat".equalsIgnoreCase(type)) {
			return new Cat();
		} else {
			return null;
		}
	}

}