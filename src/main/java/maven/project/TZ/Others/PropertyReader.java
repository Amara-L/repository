package maven.project.TZ.Others;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyReader implements Runnable{

	String path;
	Properties property;


	public PropertyReader(String path,Properties property){
		this.path = path;
		this.property = property;
	}

	public void run(){


		try (FileInputStream in = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(in, "cp1251");) {

			property.load(isr);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Properties getProperty(){
		return property;
	}

}

