package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String getprop(String folder,String filename, String propname) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("./test-classes/"+folder+"/"+filename+".properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = props.getProperty(propname);
		return str;
		
	}
}
