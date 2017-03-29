package maven.project.TZ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import maven.project.TZ.Interface.Reader_Interface;

@Service
public class Reader implements Reader_Interface{

	public Person read() throws IOException{

//Создаем HashMap, который будет хранить получаемые из properties-файла данные
		HashMap<String, String> personMap = new HashMap<String, String>();
		
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

		return person;
		

	
}

}
