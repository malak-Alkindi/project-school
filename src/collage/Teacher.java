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
	
	//------------------ class methods-------------------
	void addNewStudent(Student student) {
		studentList.add(student);
		
	}

	Student getStudent(int index) {
		return studentList.get(index);
	}
}
