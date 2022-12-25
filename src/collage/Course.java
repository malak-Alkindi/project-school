package collage;

import java.util.ArrayList;
import java.util.List;


public class Course {
	private String name;
	private int id;

	private ArrayList<Mark> markList = new ArrayList<>();
//----------------------- seters and geters-------------------------	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Mark> getMarkList() {
		return markList;
	}
	public void setMarkList(List<Mark> markList) {
		this.markList = markList;
	}
	

}
