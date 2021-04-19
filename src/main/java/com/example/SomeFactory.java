package com.example;

import io.micronaut.context.annotation.Factory;

import javax.inject.Singleton;

@Factory
public class SomeFactory {

	@Singleton
	@SomeAnnotation
	public AnotherInterface anotherService() {
		return new AnotherService();
	}

}


