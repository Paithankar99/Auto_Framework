package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	//constructor for the calling the method from baseclass realated to files
	public ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\HP\\eclipse-workspace\\Auto_Framework\\Config\\Config.Properties";
		File src=new File(filepath);
		FileInputStream fis=new FileInputStream(src); 
		pro=new Properties();
		pro.load(fis);
	}
public String getStage_Url() {
	return pro.getProperty("Stage_Url");
}
public String getLive_Url() {
	return pro.getProperty("Live_Url");
	
}
	public String getUsername_Stage() {
		return pro.getProperty("Username_Stage");
		}
	public String getPassword_Stage() {
		return pro.getProperty("Password_Stage");
		
	}
}
