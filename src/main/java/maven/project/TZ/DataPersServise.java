package maven.project.TZ;

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
