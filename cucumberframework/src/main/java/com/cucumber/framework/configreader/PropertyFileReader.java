package com.cucumber.framework.configreader;

import java.util.Properties;

import com.cucumber.framework.utility.ResourceHelper;

public class PropertyFileReader {
	
	private Properties prop=null;
	
	public PropertyFileReader()
	{
		prop= new Properties();
		try
		{
			prop.load(ResourceHelper.getResourcePathInputStream("configfile/" + "config.properties"));
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getWebSiteName()
	{
		return prop.getProperty("Website");
	}
	
	public String getBrowserName()
	{
		return prop.getProperty("Browser");
	}
	
	public int getPageLoadTimeOut()
	{
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

}
