package maven.project.TZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servise {

	@Autowired
	Date data;
	
	public Person getPers(){
		return data.getPerson();
	}

}
