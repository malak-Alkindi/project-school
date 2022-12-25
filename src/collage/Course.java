package collage;

import java.util.ArrayList;
import java.util.List;


public class Course {
	private String name;
	private int id;

	private List<Mark> markList = new ArrayList<>();
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
	
	//------------------ class methods-------------------
	void addNewmark(Mark mark) {
		markList.add(mark);
		
	}

	Mark getMark(int index) {
		return markList.get(index);
	}
}
