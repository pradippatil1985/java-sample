package com.pattern.abstractfactory;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equalsIgnoreCase(type)) {
			return new Snake();
		} if ("tyrannosaurus".equalsIgnoreCase(type)) {
			return new Tyrannosaurus();
		} else {
			return null;
		}
	}
	
}