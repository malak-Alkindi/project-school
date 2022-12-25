package collage;

import java.util.ArrayList;
import java.util.List;


public class school {

	private String location;
	private int phoneNumber;
	

	private ArrayList<Department> departmentList = new ArrayList<>();

	//----------------------- seters and geters-------------------------

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//------------------ class methods-------------------
	public void addNewDepartment(Department departmetnt) {
		departmentList.add(departmetnt);
	
	}

	ArrayList<Department>  getDepartment() {
		return departmentList;
	}

	}



