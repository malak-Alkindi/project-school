package collage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Mark implements Serializable {

	private String subjectName;
	private Integer mark;

	
//----------------------- seters and geters-------------------------	
		
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	//------------------ class methods-------------------
	 double getGpa(List<Mark> glist) {
		double total=0;
		for(Mark mark:glist) {
			total=total+(double)(mark.getMark());
		}
		return total/glist.size();
	}
}
