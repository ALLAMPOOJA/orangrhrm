package datadrentesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesWrite 
{

	public static void main(String[] args) throws IOException
	{
		File file= new File("prop.properties");
		if(!file.exists())
			file.createNewFile();
		Properties prop= new Properties();
		prop.setProperty("url","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		prop.setProperty("username","Admin");
		prop.setProperty("password","admin123");
		FileOutputStream fos= new FileOutputStream(file);
		prop.store(fos, "New File is Created");
		FileInputStream fis= new FileInputStream(file);
		prop.load(fis);
		Set<String> keys= prop.stringPropertyNames();
		System.out.println(keys);
		Collection<Object> c= prop.values();
		System.out.println(c);
		for(Object key:prop.keySet())
		System.out.println(key +  " >>>>>>>>>" + prop.getProperty((String) key));
	
		

	}

}
