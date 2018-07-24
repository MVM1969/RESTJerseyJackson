package com.mvm.rest.sample;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mvm.util.Util;

/*
 * @author Mark Marlow (mark.marlow@biogen.com)
 * @version 1.0
 * 
 * This class has the methods for all the patient Search APIs
 */

@Path("patient")
public class PatientSearch {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Path("getPatients")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	/*
	 * This method is the entry point for the getPatients REST Web Service
	 * 
	 * @param patient This represents the REST Request.
	 * 
	 * @return patient This represents the JSON Response
	 */
	public Patient getPatients(Patient patient) {

		if (!Util.validateToken(patient)) {
			return patient;
		}

		patient.setPatientFirstName("Mark");
		patient.setPatientLastName("Marlow");
		return patient;

	}

}
