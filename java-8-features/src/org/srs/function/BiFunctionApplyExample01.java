package org.srs.function;

import java.util.Calendar;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;
//? super R, ? extends V
public class BiFunctionApplyExample01 {
	
	public static void main(String[] args) {
	   
	    /*****************************BiFunction*******************************************/
		BiFunction<String, String,String> biFunction = (x, y) -> {      
	      return x + y;
	    };

	    System.out.println(biFunction.apply("arun ", " kumar"));
	    
	    
	    CalculatorService calculator = new CalculatorService();
	    String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);

	    System.out.println(result);
	    /*****************************BiFunction*******************************************/
	    
	    
	    /*****************************DoubleFunction*******************************************/
	    DoubleFunction<String> function=(d)->{return "Input value is "+d;};		
		System.out.println(function.apply(4.5));
		System.out.println(function.apply(15.5));
		/*****************************DoubleFunction*******************************************/
		
		
		/*****************************LongFunction*******************************************/
		// A function to check whether a given number is greater than zero or not.
	      LongFunction<Boolean> function1 = (a) -> a > 0;

	      System.out.println(function1.apply(50));
	      System.out.println(function1.apply(-20));

	      // A function to add number of days in current date and return new date.
	      LongFunction<Date> addDays = (day) -> {
	         Calendar calendar = Calendar.getInstance();
	         calendar.add(Calendar.DAY_OF_MONTH, (int) day);
	         return calendar.getTime();
	      };

	      System.out.println("addDays   5 "+addDays.apply(5));
	      System.out.println("addDays 50 "+addDays.apply(50));
	      /*****************************LongFunction*******************************************/
	      
	      /*****************************IntFunction*******************************************/
	      
	      IntFunction<String> i = (x)->Integer.toString(x);
	      
	      System.out.println(i.apply(3).length());
	      
	      /*****************************IntFunction*******************************************/
	      
	      
	      LongToIntFunction longToIntFunction = (l) -> (int) l;
	      System.out.println(longToIntFunction.applyAsInt(1000L));
	      System.out.println(longToIntFunction.applyAsInt(-45454L));

	      LongToIntFunction function2 = (l) -> String.valueOf(l).length();
	      System.out.println(function2.applyAsInt(454545L));
	      System.out.println(function2.applyAsInt(Long.MAX_VALUE));
	      
	      
	      /*****************************IntFunction*******************************************/
	      
	  }

}
