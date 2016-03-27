package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ParaProperties {

	private Properties pro = new Properties();
   String value = null;
	public ParaProperties(String propertiespath){
		this.loadProperties(propertiespath);
	}

	public void loadProperties(String propertiespath) {
		try {
		InputStream in = new FileInputStream(propertiespath);
			pro.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getTestData(String keyname){
		value = pro.getProperty(keyname).trim();
		try {
			value = new String(value.getBytes("UTF-8"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		}
	}

