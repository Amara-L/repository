package maven.project.TZ.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maven.project.TZ.Interface.Reader;
import maven.project.TZ.Person.Person;
@Service
public class PersonServise {

	@Autowired
	private Reader reader;
	
	public Person getPerson(){
		
				return reader.read();
	}
	
}
