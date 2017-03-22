package maven.project.TZ;

import java.util.ArrayList;

public class ReturnCollection {
	
	//Метод, разбивающий строку на список
    public ArrayList<String> getColl(String str){
    	ArrayList<String> arrayColl = new ArrayList<String>();
    	
    	String[] arrColl = str.split(";");
    	
    	for(int i = 0; i<arrColl.length; i++){
    		arrayColl.add(arrColl[i]);
    	}
    	
    	return arrayColl;
    }
    
    //Метод, возвращающий список с html-разметкой в виде строки
    public String getStr(ArrayList<String> arrayColl){
    	String str = "";
    	for(int i = 0; i<arrayColl.size(); i++){
    		str += "<li>" + arrayColl.get(i) + "</li> \n ";
    	}
    	
    	return str;
    }

}
