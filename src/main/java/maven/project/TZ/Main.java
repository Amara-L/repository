package maven.project.TZ;

import java.io.IOException;

import maven.project.TZ.Interface.Reader_Interface;
import maven.project.TZ.Interface.Record_Interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		try{
			
			ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
			
			Reader_Interface clasRead = context.getBean(Reader_Interface.class);
			Record_Interface clasRec = context.getBean(Record_Interface.class);
			
			Person person = clasRead.read();
			clasRec.rec(person);
			
			}catch (IOException e) {
		         System.err.println("Error");
			}
		
	}
	
}
