package maven.project.TZ.Interface;

import java.io.IOException;
import java.util.ArrayList;

import maven.project.TZ.Person;

public interface Record_Interface {

	public void records();
	
	public void writerFile() throws IOException;

	public void rec(Person person);
	
}
