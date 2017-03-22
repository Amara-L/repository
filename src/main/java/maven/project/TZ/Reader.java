package maven.project.TZ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Properties;

import maven.project.TZ.Interface.Reader_Interface;

public class Reader implements Reader_Interface{

	public void read() throws IOException{

//Создаем HashMap, который будет хранить получаемые из properties-файла данные
		HashMap<String, String> personMap = new HashMap<String, String>();

		/*
     Properties property = new Properties();

     try (FileInputStream in = new FileInputStream("src/main/resources/person.properties");
    	 InputStreamReader isr = new InputStreamReader(in, "cp1251");) {

		 */


		//    	 FileInputStream in = new FileInputStream("src/main/resources/person.properties");
		//    	 InputStreamReader isr = new InputStreamReader(in, "cp1251");


		/*
    	 property.load(isr);
		 */


		//         person.setFIO(property.getProperty("FIO"));
		//         person.setDOB(property.getProperty("DOB"));
		//         person.setPhone(property.getProperty("phone"));
		//         person.setEmail(property.getProperty("email"));
		//         person.setSkype(property.getProperty("skype"));
		//         person.setAvatarPath(property.getProperty("avatar"));
		//         person.setTarget(property.getProperty("target"));
		//         person.setExperiences(property.getProperty("experiences"));
		//         person.setEducations(property.getProperty("educations"));
		//         person.setAdditionalEducations(property.getProperty("additional_educations"));
		//         person.setSkills(property.getProperty("skills"));

		/*
		personMap.put("FIO", property.getProperty("FIO"));
		personMap.put("DOB", property.getProperty("DOB"));
		personMap.put("phone", property.getProperty("phone"));
		personMap.put("email", property.getProperty("email"));
		personMap.put("skype", property.getProperty("skype"));
		personMap.put("avatar", property.getProperty("avatar"));
		personMap.put("target", property.getProperty("target"));
		personMap.put("experiences", property.getProperty("experiences"));
		personMap.put("educations", property.getProperty("educations"));
		personMap.put("additional_educations", property.getProperty("additional_educations"));
		personMap.put("skills", property.getProperty("skills"));
		 */
		
		//Создаем два потока для чтения двух properties-файлов
		
		Thread thread1 = new Thread(new PropertyReader("person.properties"));
		Thread thread2 = new Thread(new PropertyReader("person2.properties"));
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Person person = new Person();

		personMap.putAll(PropertyReader.personMap);
		
		person.setMap(personMap);

		new Record(person).records();

	
	//     catch (IOException e) {
	//         System.err.println("ОШИБКА: Файл свойств отсуствует!");
	//     }
}

}
