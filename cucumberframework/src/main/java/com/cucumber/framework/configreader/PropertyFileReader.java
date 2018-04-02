package com.cucumber.framework.configreader;

import java.util.Properties;

public class PropertyFileReader {
	
	private Properties prop=null;
	
	public PropertyFileReader()
	{
		prop= new Properties();
		try
		{
			//prop.load(null);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
