package com.pattern.abstractfactory1;

public class Demo {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		VechileFactory vechileFactory1 = abstractFactory.getVechileFactory("two");
		Vechile a1 = vechileFactory1.getVechile("hero");
		System.out.println("a1 sound: " + a1.getEnginePower());
		Vechile a2 = vechileFactory1.getVechile("honda");
		System.out.println("a2 sound: " + a2.getEnginePower());

		VechileFactory vechileFactory2 = abstractFactory.getVechileFactory("four");
		Vechile a3 = vechileFactory2.getVechile("tata");
		System.out.println("a3 sound: " + a3.getEnginePower());
		Vechile a4 = vechileFactory2.getVechile("maruti");
		System.out.println("a4 sound: " + a4.getEnginePower());

	}
}
