package com.example;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;

import javax.inject.Singleton;

//@Singleton
public class SomeEventListener implements ApplicationEventListener<StartupEvent> {

	private final AnotherInterface anotherInterface;

	private final AnotherService anotherService;

	public SomeEventListener(AnotherInterface anotherInterface, AnotherService anotherService) {
		this.anotherInterface = anotherInterface;
		this.anotherService = anotherService;
	}

	@Override
	public void onApplicationEvent(StartupEvent event) {

		anotherInterface.anotherDemo();

		anotherService.anotherDemo();

	}
}
