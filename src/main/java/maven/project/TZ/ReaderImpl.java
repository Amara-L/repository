package maven.project.TZ;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import maven.project.TZ.Interface.Reader;

@Service
public class ReaderImpl implements Reader{

	public Person read(){

//Создаем HashMap, который будет хранить получаемые из properties-файла данные
		Map<String, String> personMap = new HashMap<String, String>();
		
		//Создаем два потока для чтения двух properties-файлов
		
		Thread thread1 = new Thread(new PropertyReader("person.properties"));
		Thread thread2 = new Thread(new PropertyReader("person2.properties"));
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		Person person = new Person();

		personMap.putAll(PropertyReader.personMap);
		
		person.setMap(personMap);

		return person;
		

	
}

}
