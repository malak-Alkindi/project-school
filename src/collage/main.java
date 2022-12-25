package collage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {

			System.out.println("do you want to create sschool system y/n");
			if (sc.nextLine().equals("y")) {
				int schoolIndex = 0;
				boolean schoolFlag = true;
				ArrayList<school> schoolList = new ArrayList<>();

				System.out.println("          <add first school>");
				System.out.println();
				while (schoolFlag) {
					schoolList.add(new school());
					school schoolObj = schoolList.get(schoolIndex);
					System.out.println("what is the location of the school ?");
					schoolObj.setLocation(sc.nextLine());
					System.out.println("what is the phone number of the school ?");
					schoolObj.setPhoneNumber(sc.nextInt());
					sc.nextLine();
					

					int departmetIndex = 0;
					boolean departmetFlag = true;
					ArrayList<Department> departmentList = new ArrayList<>();

					System.out.println("          <add first department>");
					System.out.println();
					while (departmetFlag) {
						departmentList.add(new Department());
						schoolObj.setDepartmentList(departmentList);
						Department departmentObj = schoolObj.getDepartmentList().get(departmetIndex);
						System.out.println("how many floors in this department ?");
						departmentObj.setFloor(sc.nextInt());
						sc.nextLine();
						System.out.println("what is the name of the department ?");
						departmentObj.setName(sc.nextLine());
				
						
						int teacherIndex = 0;
						boolean teacherFlag = true;
						ArrayList<Teacher> teacherList = new ArrayList<>();

						System.out.println("          <add first treacher>");
						System.out.println();
						while (teacherFlag) {
							teacherList.add(new Teacher());
							departmentObj.setTeachertList(teacherList);
							Teacher teacherObj = departmentObj.getTeachertList().get(teacherIndex);
							System.out.println("what is the teacher name ?");
							teacherObj.setName(sc.nextLine());
							System.out.println("what is the teacher type ?");
							teacherObj.setType(sc.nextLine());
							
							int studentIndex = 0;
							boolean studentFlag = true;
							ArrayList<Student> studentList = new ArrayList<>();

							System.out.println("          <add first student>");
							System.out.println();
							while (studentFlag) {
								studentList.add(new Student());
								teacherObj.setStudentList(studentList);
								Student studentObj =teacherObj.getStudentList().get(studentIndex);
								System.out.println("what is the studnet age ?");
								studentObj.setAge(sc.nextInt());
								sc.nextLine();
								System.out.println("what is the student name ?");
								studentObj.setName(sc.nextLine());
								
								
								
								System.out.println("do you want to add another student y/n?");
								if (sc.nextLine().equals("y")) {
									studentIndex++;
								} else {
									studentFlag = false;
									System.out.println("student added");
								}
							}
							
							
							System.out.println("do you want to add another teacher y/n?");
							if (sc.nextLine().equals("y")) {
								teacherIndex++;
							} else {
								teacherFlag = false;
								System.out.println("teadcher added");
							}
						}
						
						System.out.println("do you want to add another department y/n?");
						if (sc.nextLine().equals("y")) {
							departmetIndex++;
						} else {
							departmetFlag = false;
							System.out.println("department added");
						}
					}
					System.out.println("do you want to add another school y/n?");
					if (sc.nextLine().equals("y")) {
						schoolIndex++;
					} else {
						schoolFlag = false;
						System.out.println("school added");
					}
				}

			} else {
				flag = false;
				System.out.println("bye");
			}

		} // while loop

	}
}