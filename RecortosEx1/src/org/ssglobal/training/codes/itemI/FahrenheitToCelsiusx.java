package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsiusx {

	public static void main(String[] args) {
		// declare and initialize data
		double fahrenheit = 22.60;
		
		// calculate celsius equivalent
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		// output results
		System.out.println(fahrenheit + "\u00B0F = "
		                   + celsius + "\u00B0C");
	}

}


/**
 * Compilation errors
 * celsuis must be in double
 * fahrenheit must be in double
 * Celsius is not used in the program
 * celsius is spelled wrong in System.out.println( celcius, "u00B0C" )
 * in System.out.println( celsius, "u00B0C" ); to concat it must be + not comma
 * in System.out.println( fahrenheit, "u00B0C" ); to concat it must be + not comma
 * "\u00B0C" must be used in the output
 * "\u00B0F" must be used in the output
 * 
 * logical Error
 * remove parenthesis in 5/9
 * put parenthesis between fahrenheit - 32
 * put (fahrenheit - 32) before * 5/9
 * 
 * User Experience Error
 * at the parameter of main it must be String[]
 * x is uneccesary in naming the class
 * the naming convention of variable is wrong it must be in lower case
 * 
 * Readability error
 * Can put the values in 1 line putting = in between
 * 
 */
