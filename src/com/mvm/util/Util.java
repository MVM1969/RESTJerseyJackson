package com.mvm.util;

import com.mvm.rest.request.Message;

public class Util {

	/**
	 * This is a Util class that performs various common functions across the
	 * app.
	 */
	private static final PropertiesBundle bundle = new PropertiesBundle(
			"application");

	public static boolean validateToken(String token) {
		if (token == null)
			return false;
		else if (!token.trim().equals(bundle.getString("auth_token").trim())) {
			return false;
		} else
			return true;
	}

	public static boolean validateInput(String input) {
		if (input != null && (!input.equals(""))) {
			return true;
		}
		return false;
	}

	public static boolean validateToken(Message request) {

		if (!Util.validateToken(request.getAuth_token())) {
			ErrorMessage em = new ErrorMessage();
			em.setError_code(ErrorCodes.RC_INVALID_AUTH_TOKEN);
			em.setError_message("The authentication token is not valid!");
			request.setErrorMessage(em);
			request.setHttpResponseCode(java.net.HttpURLConnection.HTTP_BAD_REQUEST);
			return false;
		}
		return true;

	}

}
