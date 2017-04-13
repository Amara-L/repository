package maven.project.TZ;

import maven.project.TZ.Data.Date;
import maven.project.TZ.Interface.Record;
import maven.project.TZ.Others.PersonServise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl;


@SpringBootApplication
public class Main {

	@Autowired
	private static PersonServise personServise = new PersonServise();
	
	public static void main(String[] args) {
		
			ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
			
//			Record clasRec = context.getBean(Record.class);
			Date date = context.getBean(Date.class);
	
				date.person = personServise.getPerson();
// 			clasRec.rec();

		
	}
	
}
