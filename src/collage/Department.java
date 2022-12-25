package collage;

import java.util.ArrayList;
import java.util.List;



public class Department {

	private String name;
	private int floor;

	
	private ArrayList<Teacher> teachertList = new ArrayList<>();
//----------------------- seters and geters-------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public ArrayList<Teacher> getTeachertList() {
		return teachertList;
	}
	public void setTeachertList(ArrayList<Teacher> teachertList) {
		this.teachertList = teachertList;
	}
	

}

