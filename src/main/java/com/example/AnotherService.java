package com.example;

public class AnotherService implements AnotherInterface {

	@Override
	public String anotherDemo() {
		System.out.println("AnotherService.anotherDemo");
		return "anotherDemo";
	}

}
