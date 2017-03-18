package maven.project.TZ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import maven.project.TZ.Interface.Reader_Interface;

public class Reader implements Reader_Interface{

public void read() throws IOException{
	

     Properties property = new Properties();

     try (FileInputStream in = new FileInputStream("src/main/resources/person.properties");
    	 InputStreamReader isr = new InputStreamReader(in, "cp1251");) {

   
//    	 FileInputStream in = new FileInputStream("src/main/resources/person.properties");
//    	 InputStreamReader isr = new InputStreamReader(in, "cp1251");
    	 property.load(isr);
         Person person = new Person();
         
         person.setFIO(property.getProperty("FIO"));
         person.setDOB(property.getProperty("DOB"));
         person.setPhone(property.getProperty("phone"));
         person.setEmail(property.getProperty("email"));
         person.setSkype(property.getProperty("skype"));
         person.setAvatarPath(property.getProperty("avatar"));
         person.setTarget(property.getProperty("target"));
         person.setExperiences(property.getProperty("experiences"));
         person.setEducations(property.getProperty("educations"));
         person.setAdditionalEducations(property.getProperty("additional_educations"));
         person.setSkills(property.getProperty("skills"));

         
         new Record(person).records();

     } 
//     catch (IOException e) {
//         System.err.println("ОШИБКА: Файл свойств отсуствует!");
//     }
}
	
}
