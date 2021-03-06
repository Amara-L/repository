package maven.project.TZ.Others;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
	
	//Метод, разбивающий строку на список
    public static ArrayList<String> getColl(String str){
    	ArrayList<String> arrayColl = new ArrayList<String>();
    	
    	String[] arrColl = str.split(";");
    	
    	arrayColl.addAll(Arrays.asList(arrColl));
    	
    	return arrayColl;
    }
    
    //Метод, возвращающий список с html-разметкой в виде строки
    public static String getStr(ArrayList<String> arrayColl){
    	StringBuilder builder = new StringBuilder();
    	for(int i = 0; i<arrayColl.size(); i++){
    		builder.append("<li>");
    		builder.append(arrayColl.get(i));
    		builder.append("</li> \n ");
    	}
    	    	
    	return builder.toString();
    }

}
