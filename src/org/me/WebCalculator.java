package org.me;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * This class acts as the web service based calculator
 * @author Arnav
 *
 */
@WebService
public class WebCalculator {
	
	/**
	 * A sample operation
	 * 
	 * @param param the sample param
	 * @return the sample param as output
	 */
	@WebMethod(action = "Sample Operation")
	public String operation(@WebParam(name = "param_name") String param) {
		// Implementation here.
		return param;
	}
	
	/**
	 * This method adds two integers
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 */
	@WebMethod(action = "Add")
	public int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
		// Add a and b
		int sum = a + b;
		return sum;
	}
}
