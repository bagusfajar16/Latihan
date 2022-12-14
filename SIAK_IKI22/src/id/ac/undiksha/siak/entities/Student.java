package id.ac.undiksha.siak.entities;
import id.ac.undiksha.organization.*;

public class Student {
	
	private String nim;
	private String name;
	private String address;
	private boolean gender;
	private String department;
	private String faculty;
	
	private StudyProgram studyProgram;
	
	public Student() {
		this.name 			= "<invalid name>";
		this.nim 			= "<invalid nim>";
		this.address 		= "<invalid address>";
		this.department	 	= "<invalid department>";
		this.faculty 		= "<invalid faculty>";
	}
	
	
	
	public Student(String nim, String name, String address, boolean gender, String studyProgram, String department,
			String faculty) {
		super();
		this.nim = nim;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.faculty = faculty;
	}



	public void printAllInfo() {
		System.out.println("NIM: " 				+ this.nim);
		System.out.println("Name: " 			+ this.name);
		System.out.println("Address: " 			+ this.address);
		System.out.println("Department: " 		+ this.department);
		System.out.println("Faculty: " 			+ this.faculty);
		
		System.out.println("Gender: " + (gender ? "Male" : "Female"));
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public 
	
}
