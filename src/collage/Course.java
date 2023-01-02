package collage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Course implements Serializable {
	private String name;
	private Integer id;

	private ArrayList<Mark> markList ;
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
	public void setMarkList(ArrayList<Mark> markList) {
		this.markList = markList;
	}
	

}
