package collage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		List<school> schoolList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int schoolIndex = 0;
		boolean schoolCheck = true;

		while (schoolCheck) {

			System.out.println("do you want to add new school y/n?");
			if (sc.next().equals("y")) {
				sc.nextLine();
				schoolList.add(new school());
				school schoolObj = schoolList.get(schoolIndex);
				schoolIndex++;
				System.out.println("where is location of this school");
				schoolObj.setLocation(sc.nextLine());
				System.out.println("what is the phone number of this school");
				schoolObj.setPhoneNumber(sc.nextInt());

				int departmentIndex = 0;
				boolean departmentCheck = true;

				while (departmentCheck) {

					System.out.println("do you want to add new department y/n ?");
					if (sc.next().equals("y")) {
						schoolObj.addNewDepartment(new Department());
						Department departmentObj = schoolObj.getDepartment().get(departmentIndex);
						departmentIndex++;

						System.out.println("where is name of this department");
						departmentObj.setName(sc.next());
						System.out.println("how many this department occupied");
						departmentObj.setFloor(sc.nextInt());
						
						int teacherIndex = 0;
						boolean teacherCheck = true;

						while (teacherCheck) {

							System.out.println("do you want to add new teacher y/n ?");
							if (sc.next().equals("y")) {
								departmentObj.addNewTeacher(new Teacher());
								Teacher teacherObj = departmentObj.getTeacher().get(teacherIndex);
								teacherIndex++;

								System.out.println("where is name of teacher");
								teacherObj.setName(sc.next());
								System.out.println("what the teacher teach?");
								teacherObj.setType(sc.next());
							} else {
								teacherCheck = false;
								System.out.println("teacher finshed");
							}
						}
						
					} else {
						departmentCheck = false;
						System.out.println("department finshed");
					}
				}

			} else {
				schoolCheck = false;
				System.out.println("bye !!!!");
			}
		}

		for (int i = 0; i < schoolList.size(); i++) {
			school obji = schoolList.get(i);
			System.out.println();
			System.out.println();
			System.out.println(Error.black+"------------------school number("+(i+1)+")--------------");
			System.out.println();
			System.out.println(Error.blue+"school location     :"+Error.cyan + obji.getLocation());
			System.out.println(Error.blue+"school phone number :"+Error.cyan + obji.getPhoneNumber());
			System.out.println();
			
			for (int j = 0; j < obji.getDepartment().size(); j++) {
				System.out.println(Error.black+"department number("+(j+1) +")");
				Department obj = obji.getDepartment().get(j);
				System.out.println(Error.blue+"   department name              :" +Error.cyan+ obj.getName());
				System.out.println(Error.blue+"   floors occupiedby department :" +Error.cyan+ obj.getFloor());
				System.out.println();
				for (int t = 0; t < obj.getTeacher().size(); t++) {
					System.out.println(Error.black+"      teacher number("+(t+1) +")");
					Teacher objt = obj.getTeacher().get(t);
					System.out.println(Error.blue+"      the teacher name :"+Error.cyan + objt.getName());
					System.out.println(Error.blue+"      the teacher type :" +Error.cyan+ objt.getType());

				}
System.out.println();
			}
		}
	}
}