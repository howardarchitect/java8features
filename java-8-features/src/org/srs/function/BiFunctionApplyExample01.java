package org.srs.function;

import java.util.function.BiFunction;

public class BiFunctionApplyExample01 {
	
	public static void main(String[] args) {
	   
		BiFunction<String, String,String> bi = (x, y) -> {      
	      return x + y;
	    };

	    System.out.println(bi.apply("arun ", " kumar"));
	    
	    
	    CalculatorService calculator = new CalculatorService();
	    String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);

	    System.out.println(result);
	  }

}
