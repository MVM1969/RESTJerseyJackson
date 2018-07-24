package com.mvm.rest.sample;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mvm.rest.request.Message;
import com.mvm.util.ErrorMessage;

/*
 * @author Mark Marlow (mark.marlow@biogen.com)
 * @version 1.0
 * 
 * This class is the root element for all Patient requests and Responses
 */
@XmlRootElement
public class Patient extends Message implements Serializable {

	@XmlElement
	private String patientFirstName;
	@XmlElement
	private String patientLastName;

	public int getHttpResponseCode() {
		return super.httpResponseCode;
	}

	public void setHttpResponseCode(int httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
	}

	public ErrorMessage getErrorMessage() {
		return super.errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getAuth_token() {
		return super.auth_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

}
