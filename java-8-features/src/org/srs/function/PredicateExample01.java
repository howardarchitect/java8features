package org.srs.function;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
//? super R, ? extends V
public class PredicateExample01 {
	public static void main(String[] args) {

		// Predicate String
		Predicate<String> predicateString = s -> {
			return s.equals("Hello");
		};

		System.out.println(predicateString.test("Hello"));
		System.out.println(predicateString.test("Hello World"));

		// Predicate integer
		Predicate<Integer> predicateInt = i -> {
			return i > 0;
		};

		System.out.println(predicateInt.test(5));
		System.out.println(predicateInt.test(-5));

		Predicate<String> predicate = s -> {
			return s.equals("Hello");
		};

		// AND logical operation
		Predicate<String> predicateAnd = predicate.and(s -> s.length() > 4);
		System.out.println(predicateAnd.test("Hello"));

		// OR logical operation
		Predicate<String> predicateOr = predicate.or(s -> s.length() == 10);
		System.out.println(predicateOr.test("Hello"));

		// NEGATE logical operation
		Predicate<String> predicateNegate = predicate.negate();
		System.out.println(predicateNegate.test("Hello"));

		/*****************************
		 * BiPredicate
		 *******************************************/
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		System.out.println(bi.test(2, 3));

		boolean result = compare((a, b) -> a / 2 == b, 10, 5);

		System.out.println("Compare result: " + result);
		/*****************************
		 * BiPredicate
		 *******************************************/

		DoublePredicate dp = (d) -> d > 0;
		System.out.println(dp.test(0.5));

		DoublePredicate dp1 = (d) -> d > 0;
		DoublePredicate dp2 = (d) -> d == 0;

		System.out.println("dp1 and dp2 " + dp1.and(dp2).test(0.5));
		System.out.println(dp1.negate().test(0.5));
		System.out.println(dp1.or(dp2).test(0.5));
	}

	public static boolean compare(BiPredicate<Integer, Integer> bi, Integer i1, Integer i2) {
		return bi.test(i1, i2);
	}

	public static void testIntPredicate() {
		IntPredicate intPredicate = (x) -> x < 0;

		System.out.println(intPredicate.test(123));

		IntPredicate i = (x) -> x < 0;

		IntPredicate j = (x) -> x == 0;

		System.out.println(i.and(j).test(123));
		System.out.println(i.negate().test(123));
		System.out.println(i.or(j).test(123));
	}

	public static void testLongPredicate() {

		LongPredicate i = (l) -> l > 0;
		LongPredicate j = (l) -> l == 0;

		System.out.println(i.test(Long.MAX_VALUE));
		System.out.println(i.negate().test(Long.MAX_VALUE));
		System.out.println(i.or(j).test(Long.MAX_VALUE));
		System.out.println(i.and(j).test(Long.MAX_VALUE));
	}

}
