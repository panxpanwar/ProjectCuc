package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
	
	private Properties prop;
	private String configFilePath = System.getProperty("user.dir")+"/src/main/java/Config/config.properties"; //"C://Users//Dell//Desktop//Selenium//Workspace//SelCucProject//src//main//java//Config//config.properties";

	public ConfigData() {
		prop = new Properties();
		try {
			FileInputStream	fis = new FileInputStream(configFilePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {		
		} catch(IOException re) {}
	
	
	}
	
	public String getBrowser() {
		String browser = prop.getProperty("browser");
		
		return browser;
	}
	
	
	public String getUrl() {
		String Url = prop.getProperty("url");
		
		return Url;
	}
}
