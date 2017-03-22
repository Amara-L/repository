package maven.project.TZ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;

public class PropertyReader implements Runnable{

	String path;
	static HashMap personMap = new HashMap<String, String>();
	
	public PropertyReader(String path){
		this.path = "src/main/resources/" + path;
	}
	
	public void run(){
		
		Properties property = new Properties();

	     try (FileInputStream in = new FileInputStream(path);
	    	 InputStreamReader isr = new InputStreamReader(in, "cp1251");) {

	    	 property.load(isr);
	    	 
	    	 setMap(property.getProperty("FIO"),"FIO");
	    	 setMap(property.getProperty("DOB"),"DOB");
	    	 setMap(property.getProperty("phone"),"phone");
	    	 setMap(property.getProperty("email"),"email");
	    	 setMap(property.getProperty("skype"),"skype");
	    	 setMap(property.getProperty("avatar"),"avatar");
	    	 setMap(property.getProperty("target"),"target");
	    	 setMap(property.getProperty("experiences"),"experiences");
	    	 setMap(property.getProperty("educations"),"educations");
	    	 setMap(property.getProperty("additional_educations"),"additional_educations");
	    	 setMap(property.getProperty("skills"),"skills");
	    	 
	     } catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setMap(String getDate, String getName){
		if(getDate != null)
			personMap.put(getName, getDate);
	}
}

