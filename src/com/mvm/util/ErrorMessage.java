package com.mvm.util;

import javax.xml.bind.annotation.XmlElement;
/**
 * This class describes an individual Error Message of a Response.
 * 
 * @author Mark Marlow (mark.marlow@biogen.com)
 * @version 1.0
 */
public class ErrorMessage {

	@XmlElement
	private int error_code;
	@XmlElement
	private String error_message;

	public int getError_code() {
		return error_code;
	}
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

}
