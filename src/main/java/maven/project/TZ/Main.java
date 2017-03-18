package maven.project.TZ;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
//		new Reader().read();
		
		try{
			
			new Reader().read();
			
			}catch (IOException e) {
		         System.err.println("Error");
			}
		
	}
	
}
