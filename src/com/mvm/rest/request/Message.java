package com.mvm.rest.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mvm.util.ErrorMessage;

/**
 * This class represents both the JSON Request object of the REST call and the
 * JSON Response sent back to the client. It is the superclass of all JSON
 * Request classes.
 * 
 * @author Mark Marlow (mark.marlow@biogen.com)
 * @version 1.0
 */

@XmlRootElement
public class Message<E> implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement
	protected// in the Response
	int httpResponseCode;
	@XmlElement
	protected// In the Response
	ErrorMessage errorMessage;
	@XmlElement
	protected// In the Request
	String auth_token;

	public int getHttpResponseCode() {
		return httpResponseCode;
	}

	public void setHttpResponseCode(int httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getAuth_token() {
		return auth_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}

}
