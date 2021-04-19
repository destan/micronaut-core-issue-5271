package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
class DemoController {

	private final AnotherInterface anotherInterface;

	DemoController(AnotherInterface anotherInterface) {
		this.anotherInterface = anotherInterface;
	}

	@Get
	@Produces(MediaType.TEXT_PLAIN)
	String another() {
		return anotherInterface.anotherDemo();
	}

}
