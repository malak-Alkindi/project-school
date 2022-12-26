package collage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.time.LocalDateTime;
public class main {

	public static void main(String[] args) {
		Stack narkHistoryStack = new Stack();  
		Scanner sc = new Scanner(System.in);
		
		
		   
		 
		  
		format f=new format();
		boolean flag = true;
int schoolIndex = 0;
			boolean schoolFlag = true;
			List<School> schoolList = new ArrayList<>();
			
		while (flag) {
			School s =new School();
			
			

			if (sc.nextLine().equals("y")) {
			
				System.out.println("          <add first school>");
				System.out.println();
				while (schoolFlag) {
					schoolList.add(s);
					School schoolObj = schoolList.get(schoolIndex);
					System.out.println("what is the location of the school ?");
					
					
							schoolObj.setLocation(sc.nextLine());
					    
					System.out.println("what is the phone number of the school ?");
					schoolObj.setPhoneNumber(sc.nextInt());
					sc.nextLine();

					int departmetIndex = 0;
					boolean departmetFlag = true;
					ArrayList<Department> departmentList = new ArrayList<>();

					System.out.println("          <add first department> to school number :"+schoolIndex);
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

						System.out.println("          <add first treacher>to school number : "+schoolIndex);
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
										String markInput =sc.nextLine();
									
										narkHistoryStack.push(LocalDateTime.now() +"        :" +markInput);
										markObj.setSubjectName(markInput);
							
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
				System.out.println("****************** school system report (for loop)******************");
			
				for(int sci=0;sci<schoolList.size();sci++) {
				
					School sobj=schoolList.get(sci);
					System.out.println();
			System.out.println(format.red+"                 school number ("+(sci+1)+")"+format.black);
			System.out.println();
			System.out.println("school name         :"+format.blue+sobj.getLocation()+format.black);
			System.out.println("school phone number :"+format.blue+sobj.getPhoneNumber());
			System.out.println();
					for(int di=0;di<sobj.getDepartmentList().size();di++) {
						Department dobj=sobj.getDepartmentList().get(di);
						System.out.println(format.cyan+"department number ("+(di+1)+")"+format.black);
						System.out.println("department floor :"+format.blue+dobj.getFloor()+format.black);
						System.out.println("department name  :"+format.blue+dobj.getName());
						System.out.println();
						for(int ti=0;ti<dobj.getTeachertList().size();ti++) {
							Teacher tobj=dobj.getTeachertList().get(ti);
							System.out.println(format.cyan+"   teacher number ("+(ti+1)+")"+format.black);
							System.out.println("   teacher name :"+format.blue+tobj.getName()+format.black);
							System.out.println("   teacher type :"+format.blue+tobj.getType());
							System.out.println();
							for(int si=0;si<tobj.getStudentList().size();si++) {
								Student stobj=tobj.getStudentList().get(si);
								System.out.println(format.cyan+"      Student number("+(si+1)+")"+format.black);
								System.out.println("      Student name :"+format.blue+stobj.getName()+format.black);
								System.out.println("      Student age  :"+format.blue+stobj.getAge());
								System.out.println();
								for(int ci=0;ci<stobj.getCourseList().size();ci++) {
									Course cobj=stobj.getCourseList().get(ci);
									System.out.println(format.cyan+"         course number ("+(ci+1)+")"+format.black);
									System.out.println("         course name :"+format.blue+cobj.getName()+format.black);
									System.out.println("         course id   :"+format.blue+cobj.getId());
									System.out.println();
									for(int mi=0;mi<cobj.getMarkList().size();mi++) {
										Mark mobj=cobj.getMarkList().get(mi);
										System.out.printf(format.cyan+"            mark number ( %d ) \n",(mi+1) );
										System.out.println(format.black+"            mark name  :"+format.blue+mobj.getSubjectName()+format.black);
										System.out.println("            mark score :"+format.blue+mobj.getMark());
										System.out.println();
									}
								}
							}
						}
					}
				}
				
				System.out.println(format.black+"****************** school system report (for each)******************");
				for(School sf:schoolList) {
					System.out.println("school name         :"+format.blue+sf.getLocation()+format.black);
					System.out.println("school phone number :"+format.blue+sf.getPhoneNumber());
					System.out.println();
					for(Department df:sf.getDepartmentList()) {
						System.out.println("department floor :"+format.blue+df.getFloor()+format.black);
						System.out.println("department name  :"+format.blue+df.getName());
						System.out.println();
						for(Teacher tf:df.getTeachertList()) {
							System.out.println("   teacher name :"+format.blue+tf.getName()+format.black);
							System.out.println("   teacher type :"+format.blue+tf.getType());
							System.out.println();
							for(Student stf:tf.getStudentList()) {
								System.out.println("      Student name :"+format.blue+stf.getName()+format.black);
								System.out.println("      Student age  :"+format.blue+stf.getAge());
								System.out.println();
								for(Course ctf:stf.getCourseList()) {
									System.out.println("         course name :"+format.blue+ctf.getName()+format.black);
									System.out.println("         course id   :"+format.blue+ctf.getId()+format.black);
									
									System.out.println();
									for(Mark mf:ctf.getMarkList()) {
										System.out.println("            mark name  :"+format.blue+mf.getSubjectName()+format.black);
										System.out.println("            mark score :"+format.blue+mf.getMark()+format.black);
										System.out.println("         the gpa     :"+format.blue+mf.getGpa(ctf.getMarkList()));
										System.out.println();
										
									}	
								}	
								
							}
							
						}
					}
					
					
				}
			}
		

		} // while loop
		

		System.out.println(format.black+"************************************");
		System.out.print("do you want to show the mark subjects history y/n?   ");
		if(sc.nextLine().equals("y")) {
		
			School.history(narkHistoryStack);
		}
		else {
			System.out.println("ok fine no history");
		}
	}
	
	
}