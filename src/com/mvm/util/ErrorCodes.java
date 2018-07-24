package com.mvm.util;

public final class ErrorCodes {

	/**
	 * The response code that represents the status of no error (authorization
	 * code was successfully granted)
	 */
	public static final int RC_SUCCESS = 0;
	/**
	 * The response code that indicates there was a technical issue while
	 * processing
	 */
	public static final int RC_TECHNICAL_ISSUE = 1;
	/**
	 * The response code that indicates the received list of TRN IDs was not
	 * valid
	 */
	public static final int RC_INVALID_TRNID = 2;
	/**
	 * The response code that indicates the received Auth Token was not valid
	 */
	public static final int RC_INVALID_AUTH_TOKEN = 3;
	/**
	 * The response code that indicates the Prescriber REMS ID did not return
	 * data
	 */
	public static final int RC_PRESCRIBER_NOT_FOUND = 4;
	/**
	 * The response code that indicates the Delegate ID did not return data
	 */
	public static final int RC_DELEGATE_NOT_FOUND = 5;
	/**
	 * The response code that indicates there was data missing in the Request
	 */
	public static final int RC_MISSING_INPUT_DATA = 6;

}
