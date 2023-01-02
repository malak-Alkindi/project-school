package collage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Student implements Serializable ,Assigning{

	private String name;
	private Integer age;

	
	private ArrayList<Course> courseList;
//----------------------- seters and geters-------------------------	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	
}
