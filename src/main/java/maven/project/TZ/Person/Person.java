package maven.project.TZ.Person;

import java.util.ArrayList;
import java.util.Map;

import maven.project.TZ.Others.Utils;



public class Person {

	private String FIO;

	private String DOB;

	private String phone;

	private String email;

	private String skype;

	private String avatar;

	private String target;

	private String experiences;

	private String educations;

	private ArrayList<String> additionalEducations;

	private ArrayList<String> skills;


	public void setMap(Map<String, String> personMap){
		FIO = personMap.get("FIO");
		DOB = personMap.get("DOB");
		phone = personMap.get("phone");
		email = personMap.get("email");
		skype = personMap.get("skype");
		avatar = personMap.get("avatar");
		target = personMap.get("target");
		experiences = personMap.get("experiences");
		educations = personMap.get("educations");
		
		//Преобразуем полученные строки в список, вызывая метод getColl из класса ReturnCollection
		additionalEducations = Utils.getColl(personMap.get("additional_educations"));
		skills = Utils.getColl(personMap.get("skills"));
	}

	public String getFIO() {
		return FIO;
	}

	public void setFIO(String FIO) {
		this.FIO = FIO;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatarPath(String avatar) {
		this.avatar = avatar;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getExperiences() {
		return experiences;
	}

	public void setExperiences(String experiences) {
		this.experiences = experiences;
	}

	public String getEducations() {
		return educations;
	}

	public void setEducations(String educations) {
		this.educations = educations;
	}

	public ArrayList<String> getAdditionalEducations() {
		return additionalEducations;
	}

	public void setAdditionalEducations(String additionalEducations) {
		this.additionalEducations = Utils.getColl(additionalEducations);
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = Utils.getColl(skills);
	}


}


