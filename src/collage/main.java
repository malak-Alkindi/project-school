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
			int schoolIndex = 0;
			boolean schoolFlag = true;
			ArrayList<school> schoolList = new ArrayList<>();

			if (sc.nextLine().equals("y")) {
			
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
								Student studentObj = teacherObj.getStudentList().get(studentIndex);
								System.out.println("what is the studnet age ?");
								studentObj.setAge(sc.nextInt());
								sc.nextLine();
								System.out.println("what is the student name ?");
								studentObj.setName(sc.nextLine());

								int courseIndex = 0;
								boolean courseFlag = true;
								ArrayList<Course> courseList = new ArrayList<>();

								System.out.println("          <add first course>");
								System.out.println();
								while (courseFlag) {
									courseList.add(new Course());
									studentObj.setCourseList(courseList);
									Course courseObj = studentObj.getCourseList().get(courseIndex);
									System.out.println("what is the course name ?");
									courseObj.setName(sc.nextLine());
							
									System.out.println("what is the course id ?");
									courseObj.setId(sc.nextInt());
									sc.nextLine();

									int markIndex = 0;
									boolean markFlag = true;
									ArrayList<Mark> markList = new ArrayList<>();

									System.out.println("          <add first mark>");
									System.out.println();
									while (markFlag) {
										markList.add(new Mark());
									courseObj.setMarkList(markList);
										Mark markObj = courseObj.getMarkList().get(markIndex);
										System.out.println("what is the subject name ?");
										markObj.setSubjectName(sc.nextLine());
							
										System.out.println("what is the subject mark ?");
										markObj.setMark(sc.nextInt());
										sc.nextLine();

										System.out.println("do you want to add another mark y/n?");
										if (sc.nextLine().equals("y")) {
											markIndex++;
										} else {
											markFlag = false;
											System.out.println("mark added");
										}
									}
									System.out.println("do you want to add another course y/n?");
									if (sc.nextLine().equals("y")) {
										courseIndex++;
									} else {
										courseFlag = false;
										System.out.println("course added");
									}
								}

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
				System.out.println("****************** school system report ******************");
				System.out.println();
				for(int sci=0;sci<schoolList.size();sci++) {
				
					school sobj=schoolList.get(sci);
			System.out.println("school number ("+(sci+1)+")");
			System.out.println("school name         :"+sobj.getLocation());
			System.out.println("school phone number :"+sobj.getPhoneNumber());
			System.out.println();
					for(int di=0;di<sobj.getDepartmentList().size();di++) {
						Department dobj=sobj.getDepartmentList().get(di);
						System.out.println("department number ("+(di+1)+")");
						System.out.println("department floor :"+dobj.getFloor());
						System.out.println("department name  :"+dobj.getName());
						System.out.println();
						for(int ti=0;ti<dobj.getTeachertList().size();ti++) {
							Teacher tobj=dobj.getTeachertList().get(ti);
							System.out.println("teacher number ("+(ti+1)+")");
							System.out.println("teacher name :"+tobj.getName());
							System.out.println("teacher type :"+tobj.getType());
							for(int si=0;si<tobj.getStudentList().size();si++) {
								Student stobj=tobj.getStudentList().get(si);
								System.out.println("Student number("+(si+1)+")");
								System.out.println("Student name :"+stobj.getName());
								System.out.println("Student age  :"+stobj.getAge());
								for(int ci=0;ci<stobj.getCourseList().size();ci++) {
									Course cobj=stobj.getCourseList().get(ci);
									System.out.println("course number ("+(ci+1)+")");
									System.out.println("course name :"+cobj.getName());
									System.out.println("course id   :"+cobj.getId());
									for(int mi=0;mi<cobj.getMarkList().size();mi++) {
										Mark mobj=cobj.getMarkList().get(mi);
										System.out.println("mark number ("+(mi+1)+")");
										System.out.println("mark namr  :"+mobj.getSubjectName());
										System.out.println("mark score :"+mobj.getMark());
									}
								}
							}
						}
					}
				}
			}

		} // while loop
		


	}
	
	
}