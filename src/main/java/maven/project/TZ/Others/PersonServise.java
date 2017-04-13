package maven.project.TZ.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maven.project.TZ.Interface.Reader;
import maven.project.TZ.Person.Person;
import maven.project.TZ.Reader.ReaderImpl;
@Service
public class PersonServise {

	@Autowired
	private Reader reader = new ReaderImpl();
	
	public Person getPerson(){
		
				return reader.read();
//		ReaderImpl imp = new ReaderImpl();
//		return imp.read();
	}
	
}
