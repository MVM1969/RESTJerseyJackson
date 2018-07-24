package com.mvm.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;


/**
 * PropertiesBundle.java
 * 
 * This class provides access to a properties file for other classes to obtain input information based on a key name.
 * 
 * @author Dan Longo (dan.longo@biogen.com)
 * @version 1.0
 */
public class PropertiesBundle
{
	/** The Resource Bundle used to retrieve properties based on keys */
	private final ResourceBundle RESOURCE_BUNDLE;

	/** The log4j object used for logging information and errors **/
	private static Logger logger = Logger.getLogger(PropertiesBundle.class);
	
	/**
	 * This constructor initializes the resource bundle using the provided bundle name.
	 * 
	 * @param bundleName The name of the bundle to retrieve properties from
	 */
	public PropertiesBundle(String bundleName)
	{
		RESOURCE_BUNDLE = ResourceBundle.getBundle(bundleName);
	}
	
	/**
	 * This method returns the property value from the ResourceBundle that maps to the given key.
	 * 
	 * @param key The key in the properties file to search for and retrieve its value
	 * @return The value of the given key, or null if the key does not exist in the bundle
	 */
	public String getString(String key) 
	{
		try 
		{
			return RESOURCE_BUNDLE.getString(key);
		} 
		catch (MissingResourceException e) 
		{
			logger.error("An error occurred while retrieving the property for the key '" + key + "'.  " + e);
			return null;
		}
	}
	
	/**
	 * This main method is for simple unit testing
	 * 
	 * @param args Command line arguments; not used
	 */
	public static void main(String[] args)
	{
		PropertiesBundle pb = new PropertiesBundle("application");
		System.out.println("Testing bundle lookup for test: " + pb.getString("tws_url"));
	}
}
