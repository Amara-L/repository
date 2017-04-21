package maven.project.TZ.Reader;


import java.util.Properties;

import org.springframework.stereotype.Service;

import maven.project.TZ.Interface.Reader;
import maven.project.TZ.Others.PropertyReader;
import maven.project.TZ.Person.Person;

@Service
public class ReaderImpl implements Reader{

	final static String PROPERTY_PATH_1 = "src/main/resources/person.properties";
	final static String PROPERTY_PATH_2 = "src/main/resources/person2.properties";

	public Person read(){	
		
		//Создаем два потока для чтения двух properties-файлов
		Properties property = new Properties();
		Thread thread1 = new Thread(new PropertyReader(PROPERTY_PATH_1,property));
		Thread thread2 = new Thread(new PropertyReader(PROPERTY_PATH_2,property));
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		Person person = new Person(property);

		return person;
		

	
}

}
