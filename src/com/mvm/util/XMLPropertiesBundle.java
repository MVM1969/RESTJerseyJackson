package com.mvm.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/**
 * XMLPropertiesBundle.java
 * 
 * This class handles parsing properties out of an XML file and makes them available in a hash table.
 * 
 * @author Dan Longo (dan.longo@biogen.com)
 * @version 1.0
 */
public class XMLPropertiesBundle
{
	/** The hash table that maps a key name to its property value **/
	private final Hashtable<String, String> PROPERTIES_TABLE;

	/**
	 * This constructor initializes the hash table by calling the buildPropertiesTable method.
	 * 
	 * @param propertiesFile The XML file that contains the properties
	 */
	public XMLPropertiesBundle(String propertiesFile)
	{
		PROPERTIES_TABLE = buildPropertiesTable(propertiesFile);
	}
	
	/**
	 * This method handles reading property keys and their associated values from the given XML file and 
	 * stores them into the hash table for future retrieval.  The hash table is returned, or null is returned if 
	 * there is a problem while reading from the input file.
	 * 
	 * @param propertiesFile The input XML file to parse the properties out of
	 * @return A hash table containing the property keys and associated values from the XML file
	 */
	private Hashtable<String,String> buildPropertiesTable(String propertiesFile)
	{	
		try 
		{
			Hashtable<String, String> queryTable = new Hashtable<String, String>();
			String key = null;
			
			Properties properties = new Properties();
			properties.loadFromXML(Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFile));

			Enumeration<Object> enuKeys = properties.keys();
			
			while(enuKeys.hasMoreElements()) 
			{
				key = (String)enuKeys.nextElement();
				queryTable.put(key, properties.getProperty(key));
			}
			
			return queryTable;
	 	} 
		catch (IOException ex) 
		{
	 		return null;
	    }	
	}
	

	/**
	 * This method returns the value from the hash table for the given key.
	 *  
	 * @param key The key in the hash table to return the property for
	 * @return The property in the hash table for the given key as a trimmed String
	 */
	public String getProperty(String key) 
	{	
		if(PROPERTIES_TABLE != null)
			return PROPERTIES_TABLE.get(key).trim();
		
		else return null;
	}
	
	/**
	 * Main method, for testing purposes only
	 * 
	 * @param args Command line arguments, not used
	 */
	public static void main(String[] args)
	{
		
	}
	
}