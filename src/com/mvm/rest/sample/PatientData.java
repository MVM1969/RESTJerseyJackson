package com.mvm.rest.sample;

/**
 /*
 *
 * This class stores the data associated with a Patient
 * 
 * @author Mark Marlow (mark.marlow@biogen.com)
 * @version 1.0
 */

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.mvm.util.ErrorMessage;

public class PatientData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private ErrorMessage errorMessage;
	@XmlElement
	private String patientFirstName;
	@XmlElement
	private String patientLastName;

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
