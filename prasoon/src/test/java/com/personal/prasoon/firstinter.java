/**
 * 
 */
package com.personal.prasoon;

/**
 * @author praso
 *
 */
public interface firstinter {
	
	public String first(String name, String Add, String Sch_name);
	
	default void second() {
		System.out.println("Default Interface");
	}
	
	static void third() {
		System.out.println("Static interface");
	}

}


