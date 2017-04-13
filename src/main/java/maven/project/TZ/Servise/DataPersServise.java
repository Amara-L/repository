package maven.project.TZ.Servise;

import maven.project.TZ.Data.Date;
import maven.project.TZ.Person.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataPersServise {
	
	 final Date data;

	 @Autowired

	 public DataPersServise(Date data) {

	 this.data = data;

	 }
	
	public Person getPers(){
		return data.getPerson();
	}

}
