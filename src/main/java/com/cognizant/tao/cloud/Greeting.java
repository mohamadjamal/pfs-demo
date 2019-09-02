package com.cognizant.tao.cloud;

import java.util.function.Function;

public class Greeting implements Function<String, String> {

	public String apply(String name) {
		return "Welcome to Cloud Foucs Group : " + name;
	}
}
