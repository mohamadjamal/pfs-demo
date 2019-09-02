package com.cognizant.tao.cloud;

import java.util.function.Function;

public class Square implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer input) {
		if (null == input) {
			return 0;
		}
		System.out.println("Input : " + input);
		return input * input;
	}
}
