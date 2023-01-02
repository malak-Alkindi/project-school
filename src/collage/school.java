package collage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class School implements Serializable {

	private String location;
	private Integer phoneNumber;
	
	private ArrayList<Department> departmentList;

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
	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	static void history(Stack stk){
		for(int i=0;i<=stk.size();i++) {
		System.out.println(format.red +stk.pop());
	}}
	
	}



