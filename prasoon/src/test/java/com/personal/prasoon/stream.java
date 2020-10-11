package com.personal.prasoon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test[] = {"first","second","third","fourth"};
		
		List <String> sample= Arrays.asList(test);
		
		 sample.stream().filter(s ->s.startsWith("t")).forEach(s->System.out.print(s));
	}

}
