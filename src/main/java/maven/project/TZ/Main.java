package maven.project.TZ;

import maven.project.TZ.Data.Date;
import maven.project.TZ.Interface.Record;
import maven.project.TZ.Others.PersonServise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;




@SpringBootApplication
public class Main {
	
	
	public static void main(String[] args) {

			ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

		PersonServise personServise = context.getBean(PersonServise.class);
			
			Record clasRec = context.getBean(Record.class);
			Date date = context.getBean(Date.class);

		date.person = personServise.getPerson();
 			clasRec.rec();

		
	}
	
}
