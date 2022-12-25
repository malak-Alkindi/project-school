package collage;

import java.util.ArrayList;
import java.util.List;



public class Teacher {

	private String type;
	private String name;
	
	
	private ArrayList<Student> studentList = new ArrayList<>();
//----------------------- seters and geters-------------------------	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}
