package org.automation.mccormick.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Object fetchpropertyValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("./Config/config.properties"); // to declare the file path
		Properties property = new Properties(); // for making connection with the property file
		property.load(file); // to load the file
		return property.get(key); // this will return object of this key value.
	}

	public static String fetchelementvalue(String key) throws IOException {

		FileInputStream file = new FileInputStream("./Config/Element.Properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}

	public static String fetchassertionvalue(String key) throws IOException {

		FileInputStream file = new FileInputStream("./Config/Assertion.properties");
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key).toString();
	}

}
