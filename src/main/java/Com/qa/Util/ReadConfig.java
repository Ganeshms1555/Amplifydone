package Com.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	Properties pro;
	public ReadConfig () {
		File src=new File("./Configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	}catch(Exception e) {
		System.out.println("Exception is "+ e.getMessage());
	}
	}
	public String getApplicationUrl() 
	{
		String url= pro.getProperty("URL");
		return url;	
	}
	public String getusername() {
		String  Username= pro.getProperty("Username");
		return Username;
	}
	public String getpassword() {
		String  password= pro.getProperty("Password");
		return password;
	}
	public String getbrowser() {
		String  browser= pro.getProperty("chromepath");
		return browser;
	}
	public String getbrowserfirefox() {
		String  browser= pro.getProperty("firefox");
		return browser;
	}
	

}
