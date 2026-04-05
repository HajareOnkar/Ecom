package GenaricLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiles{
	
	public String getProperty(String propertyname) throws IOException { 
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyFilePath);
	p.load(fis);
	return p.getProperty(propertyname);
	}
}
