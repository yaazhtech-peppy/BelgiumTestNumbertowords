/**
 * 
 */
package com.belgium.numtoword.business.exception;

/**
 * @author PC
 *
 */
public class BusinessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8244730983520673629L;
	
	public BusinessException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
}
