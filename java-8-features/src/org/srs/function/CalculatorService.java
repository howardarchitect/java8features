package org.srs.function;

import java.util.function.BiFunction;

public class CalculatorService {
	public String calc(BiFunction<Integer, Integer, String> biFunction, Integer i1, Integer i2) {
	      return biFunction.apply(i1, i2);
	  }
}
