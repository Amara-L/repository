package maven.project.TZ.Interface;

import java.util.ArrayList;

public interface Record_Interface {

	public void records(String FIO,String DOB,String Phone,String Email,String Skype,String Avatar,String Target,String Experiences,String Educations,ArrayList<String> AdditionalEducations,ArrayList<String> Skills);
	
	public void writerFile();
	
}
