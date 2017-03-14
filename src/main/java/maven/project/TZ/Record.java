package maven.project.TZ;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import maven.project.TZ.Interface.Record_Interface;

public class Record implements Record_Interface{
	static String html;
	
	public void records(String FIO,String DOB,String Phone,String Email,String Skype,String Avatar,String Target,String Experiences,String Educations,String AdditionalEducations,String Skills){
		html = "<!DOCTYPE html>\n" +
"<html style=\"background: #EDEEF0\">\n" +
"<head>\n" +
"   <meta charset=\"Cp1251\">\n" +
"</head>\n" +
"<body style=\"width: 50%; margin-left:25%;background:white\">\n" +
"<header style=\"padding-top:0.1em; margin-top:2em\">\n" +
"   <h2 align=\"center\">Резюме</h2>\n" +
"    <h3 align=\"center\">на должность Java-стажер</h3>\n" +
"</header>\n" +
"    <div id=\"inform\">\n" +
"    <div id=\"inform1\" style=\"width: 20%; float: left; padding-right: 3%\">\n" +
"    <p align=\"right\"> <b>ФИО:</b></p>\n" +
"    <p align=\"right\"> <b>Дата рождения:</b></p>\n" +
"    <p align=\"right\"> <b>Телефон:</b></p>\n" +
"    <p align=\"right\"> <b>Email:</b></p>\n" +
"    <p align=\"right\"> <b>Skype:</b></p>\n" +
"    </div>\n" +
"    <div id=\"inform2\" style=\"width: 40%; float: left\">\n" +
"    <p>"+FIO+"</p>\n" +
"    <p>"+DOB+"</p>\n" +
"    <p>"+Phone+"</p>\n" +
"    <p>"+Email+"</p>\n" +
"    <p>"+Skype+"</p>\n" +
"    </div>\n" +
"    <div id=\"avatar\" style=\"float: left\">\n" +
"    <img src=\""+Avatar+"\" alt=\"Изображение отсутствует\" aling=\"center\">\n" +
"    </div>\n" +
"        </div>\n" +
"    <div style=\"clear: both; margin-left:2%; padding-top:0.3em; padding-bottom:1.5em\">\n" +
"    <h3>Цель:</h3>\n" +
"    "+Target+"\n" +
"        <h3>Опыт работы:</h3>\n" +
"    "+Experiences+"\n" +
"        <h3>Образование:</h3>\n" +
"    "+Educations+"\n" +
"        <h3>Пройденные курсы:</h3>\n" +
"    "+AdditionalEducations+"\n" +
"        <h3>Навыки:</h3>\n" +
"    "+Skills+"\n" +
"    </div>\n" +
"</body>\n" +
"</html>";
		
		writerFile();
	}
	
	public void writerFile() {

		File file = new File("src\\main\\file\\summary.html");
		try {

			Writer out = new OutputStreamWriter(new FileOutputStream(file), "Cp1251");

			try {
				out.write(html);
			} finally {
				out.close();
			}
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

	}

}
