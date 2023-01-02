package collage;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import java.time.LocalDateTime;

public class main {

	public static void main(String[] args) throws Exception {
		Stack narkHistoryStack = new Stack();
		Scanner sc = new Scanner(System.in);
		School sss = new School();
		Class<?> aa = sss.getClass(); // Type information associated with type `A`
		System.out.println(aa.getName());

		System.out.println("enter the name of file you want to create");
		String fileName = sc.nextLine();
		try {
			File ff = new File("C:\\Users\\Lenovo\\Desktop\\" + fileName + ".txt");

			if (ff.createNewFile()) {
				System.out.println("File created:\t" + ff.getName());
			} else {
				System.out.println("File already exists.");
				System.out.println(ff.getPath());

			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		FileWriter w = new FileWriter("C:\\Users\\Lenovo\\Desktop\\" + fileName + ".txt");
		System.out.println("enter the name of file you want to read ?");
		String fileNameRead = sc.nextLine();

		BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\" + fileNameRead + ".txt"));
		String line = null;

		System.out.println("enter world to search");
		String input = sc.nextLine().toLowerCase();
		String[] words = null;
		Integer count = 0;
		String n = "";
		while ((line = fileReader.readLine()) != null) {

			words = line.split(" ");

			for (String word : words)

			{
				n = word.toString().toLowerCase();
				if (word.equals(input)) {
					// System.out.println(line);
					// System.out.println();
					count++;
				}
			}
		}
		while ((line = fileReader.readLine()) != null) {

			words = line.split(" "); // Split the word using space
			for (String word : words) {
				if (word.equals(input)) {
					System.out.println(line);
					System.out.println();
					count++;
				}
			}
		}
		System.out.println(n);
//		 if(count!=0)  
//	      {
//	         System.out.println("The given word <"+input+"> showed"+count+ " Times in the file");
//	      }
//	      else
//	      {
//	         System.out.println("The given word is not present in the file");
//	      }

		// System.out.print(line);
		System.out.println();


		boolean flag = true;
		boolean schoolFlag = true;
		List<School> schoolList = new ArrayList<>();
System.out.println("do you want to create school system y/n");
		while (flag) {
	

			if (sc.nextLine().equals("y")) {

				System.out.println("\t\t\t\t<add first school>\n");
			
				while (schoolFlag) {
					School school = new School();
					System.out.println("what is the location of the school ?");

					school.setLocation(sc.nextLine());

					System.out.println("what is the phone number of the school ?");
					school.setPhoneNumber(sc.nextInt());
					sc.nextLine();

			
					boolean departmetFlag = true;
					
					ArrayList<Department> departmentList = new ArrayList<>();

					System.out.println("\t\t\t\t<add first department> to school number :\n");
				
					while (departmetFlag) {
						Department department =new Department();
						System.out.println("how many floors in this department ?");
						department.setFloor(sc.nextInt());
						sc.nextLine();
						System.out.println("what is the name of the department ?");
						department.setName(sc.nextLine());

		
						boolean teacherFlag = true;
						ArrayList<Teacher> teacherList = new ArrayList<>();

						System.out.println("\t\t\t\t<add first treacher>to school number : " );
						System.out.println();
						while (teacherFlag) {
							Teacher teacher	=new Teacher();
						
							System.out.println("what is the teacher name ?");
							teacher.setName(sc.nextLine());
							System.out.println("what is the teacher type ?");
							teacher.setType(sc.nextLine());

						
							boolean studentFlag = true;
							ArrayList<Student> studentList = new ArrayList<>();

							System.out.println("\t\t\t\t<add first student>");
							System.out.println();
							while (studentFlag) {
								Student student=new Student();
								student.introduceToDepartment();
								System.out.println("what is the studnet age ?");
								student.setAge(sc.nextInt());
								sc.nextLine();
								System.out.println("what is the student name ?");
								student.setName(sc.nextLine());

						
								boolean courseFlag = true;
								ArrayList<Course> courseList = new ArrayList<>();

								System.out.println("\t\t\t\t<add first course>");
								System.out.println();
								while (courseFlag) {
									Course course=new Course();
						
									System.out.println("what is the course name ?");
									course.setName(sc.nextLine());

									System.out.println("what is the course id ?");
									course.setId(sc.nextInt());
									sc.nextLine();

							
									boolean markFlag = true;
									ArrayList<Mark> markList = new ArrayList<>();

									System.out.println("\t\t\t\t<add first mark>\n");
								
									while (markFlag) {
										Mark mark =new Mark();
										System.out.println("what is the subject name ?");
										String markInput = sc.nextLine();

										narkHistoryStack.push(LocalDateTime.now() + "\t\t\t\t :" + markInput);
										mark.setSubjectName(markInput);

										System.out.println("what is the subject mark ?");
										mark.setMark(sc.nextInt());
										sc.nextLine();
										markList.add(mark);
										course.setMarkList(markList);
										System.out.println("do you want to add another mark y/n?");
										if (sc.nextLine().equals("y")) {
								
										} else {
											markFlag = false;
											System.out.println("mark added");
										}
									}
									courseList.add(course);
									student.setCourseList(courseList);
									System.out.println("do you want to add another course y/n?");
									if (sc.nextLine().equals("y")) {
									
									} else {
										courseFlag = false;
										System.out.println("course added");
									}
								}
								studentList.add(student);
								teacher.setStudentList(studentList);
								System.out.println("do you want to add another student y/n?");
								if (sc.nextLine().equals("y")) {
						
								} else {
									studentFlag = false;
									System.out.println("student added");
								}
							}
							
							teacherList.add(teacher);
							department.setTeachertList(teacherList);
							System.out.println("do you want to add another teacher y/n?");
							if (sc.nextLine().equals("y")) {
						
							} else {
								teacherFlag = false;
								System.out.println("teadcher added");
							}
						}
						
						departmentList.add(department);
						school.setDepartmentList(departmentList);
						System.out.println("do you want to add another department y/n?");
						if (sc.nextLine().equals("y")) {
				
						} else {
							departmetFlag = false;
							System.out.println("department added");
						}
					}
					schoolList.add(school);
		
					System.out.println("do you want to add another school y/n?");
					if (sc.nextLine().equals("y")) {
					
					} else {
						schoolFlag = false;
						System.out.println("school added");
					}
				}

			} else {
				flag = false;
				System.out.println("****************** school system report (for loop)******************");
				w.write("****************** school system report (for loop)****************** \n \n");

				for (int sci = 0; sci < schoolList.size(); sci++) {

					School sobj = schoolList.get(sci);
				
					System.out.println(format.red + "\n\t\t\t\tschool number (" + (sci + 1) + ")" + format.black);
					w.write("\t\t\t\tschool number (" + (sci + 1) + ")\n ");
					System.out.println();
					System.out.println("school name         :" + format.blue + sobj.getLocation() + format.black);
					w.write("school name         :" + sobj.getLocation() + " \n ");
					System.out.println("school phone number :" + format.blue + sobj.getPhoneNumber());
					w.write("school phone number :" + sobj.getLocation() + " \n \n ");
			
					for (int di = 0; di < sobj.getDepartmentList().size(); di++) {
						Department dobj = sobj.getDepartmentList().get(di);
						System.out.println(format.cyan + "department number (" + (di + 1) + ")" + format.black);
						w.write("department number (" + (di + 1) + ") \n ");
						System.out.println("department floor :" + format.blue + dobj.getFloor() + format.black);
						w.write("department floor :" + dobj.getFloor() + "\n ");
						System.out.println("department name  :" + format.blue + dobj.getName());
						w.write("department name :" + dobj.getName() + "\n \n");
					
						for (int ti = 0; ti < dobj.getTeachertList().size(); ti++) {
							Teacher tobj = dobj.getTeachertList().get(ti);
							System.out.println(format.cyan + "   teacher number (" + (ti + 1) + ")" + format.black);
							w.write("\tteacher number (" + (di + 1) + ") \n ");
							System.out.println("   teacher name :" + format.blue + tobj.getName() + format.black);
							w.write("\tteacher name :" + tobj.getName() + " \n ");
							System.out.println("   teacher type :" + format.blue + tobj.getType());
							w.write("\tteacher type :" + tobj.getType() + "\n \n ");
							System.out.println();
							for (int si = 0; si < tobj.getStudentList().size(); si++) {
								Student stobj = tobj.getStudentList().get(si);
								System.out
										.println(format.cyan + "\t\tStudent number(" + (si + 1) + ")" + format.black);
								w.write("\t\tStudent number(" + (si + 1) + ") \n ");
								System.out
										.println("      Student name :" + format.blue + stobj.getName() + format.black);
								w.write("\t\tStudent name :" + stobj.getName() + " \n ");
								System.out.println("      Student age  :" + format.blue + stobj.getAge());
								w.write("\t\tStudent age  :" + stobj.getAge() + "\n \n ");
								
								for (int ci = 0; ci < stobj.getCourseList().size(); ci++) {
									Course cobj = stobj.getCourseList().get(ci);
									System.out.println(
											format.cyan + "\t\t\tcourse number (" + (ci + 1) + ")" + format.black);
									w.write("\t\t\tcourse number (" + ci + 1 + " \n ");
									System.out.println(
											"\t\t\tcourse name :" + format.blue + cobj.getName() + format.black);
									w.write("\t\t\tcourse name :" + cobj.getName() + " \n ");
									System.out.println("\t\t\tcourse id   :" + format.blue + cobj.getId());
									w.write("\t\t\tcourse id   :" + cobj.getId() + " \n \n");
								
									for (int mi = 0; mi < cobj.getMarkList().size(); mi++) {
										Mark mobj = cobj.getMarkList().get(mi);
										System.out.printf(format.cyan + "\t\t\t\tmark number ( %d ) \n", (mi + 1));
										w.write("\t\t\t\tmark number(" + (mi + 1) + ") \n ");
										System.out.println(
												format.black + "\t\t\t\tmark name  :" + mobj.getSubjectName());
										w.write("\t\t\t\tmark name  :" + mobj.getSubjectName() + " \n ");
										System.out.println("\t\t\t\tmark score :" + format.blue + mobj.getMark());
										w.write("\t\t\t\tmark score :" + mobj.getMark() + " \n \n ");
									
									}
								}
							}
						}
					}
					w.close();
				}

				System.out
						.println(format.black + "****************** school system report (for each)******************");
				for (School sf : schoolList) {
					System.out.println("school name         :" + format.blue + sf.getLocation() + format.black);
					System.out.println("school phone number :" + format.blue + sf.getPhoneNumber());
					System.out.println();
					for (Department df : sf.getDepartmentList()) {
						System.out.println("department floor :" + format.blue + df.getFloor() + format.black);
						System.out.println("department name  :" + format.blue + df.getName());
						System.out.println();
						for (Teacher tf : df.getTeachertList()) {
							System.out.println("\tteacher name :" + format.blue + tf.getName() + format.black);
							System.out.println("\tteacher type :" + format.blue + tf.getType());
							System.out.println();
							for (Student stf : tf.getStudentList()) {
								System.out.println("\t\tStudent name :" + format.blue + stf.getName() + format.black);
								System.out.println("\t\tStudent age  :" + format.blue + stf.getAge());
								System.out.println();
								for (Course ctf : stf.getCourseList()) {
									System.out.println(
											"\t\t\tcourse name :" + format.blue + ctf.getName() + format.black);
									System.out.println(
											"\t\t\tcourse id   :" + format.blue + ctf.getId() + format.black);

									System.out.println();
									for (Mark mf : ctf.getMarkList()) {
										System.out.println("\t\t\t\tmark name  :" + format.blue
												+ mf.getSubjectName() + format.black);
										System.out.println(
												"\t\t\t\tmark score :" + format.blue + mf.getMark() + format.black);
										System.out.println(
												"\t\t\t\tthe gpa     :" + format.blue + mf.getGpa(ctf.getMarkList()));
										System.out.println();

										FileOutputStream ff = new FileOutputStream(new File("myObjects.txt"));
										ObjectOutputStream o = new ObjectOutputStream(ff);

										// Write objects to file
										o.writeObject(mf);

										o.close();
										ff.close();

										FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
										ObjectInputStream oi = new ObjectInputStream(fi);

										// Read objects
										Mark pr1 = (Mark) oi.readObject();

										System.out.println("the out put from the saved opjects : ");
										System.out.println(pr1.getMark() + "\n");

										oi.close();
										fi.close();

									}
								}

							}

						}
					}

				}
			}

		} // while loop

		System.out.println(format.black + "************************************");
		System.out.print("do you want to show the mark subjects history y/n?   ");
		if (sc.nextLine().equals("y")) {

			School.history(narkHistoryStack);
		} else {
			System.out.println("ok fine no history");
		}

	}

}

//
//Scanner sc = new Scanner(System.in);
//ArrayList<String> usersInput = new ArrayList<>();
//Random random = new Random();
//boolean listFlag=true;
//
//
//
//System.out.println("enter words you want to add to your list and then to file ");
//while(listFlag) {
//usersInput.add(sc.nextLine());
//System.out.print("do you want to add another word y/n?   ");
//if(sc.nextLine().toLowerCase().endsWith("y")) {
//listFlag=true;
//System.out.println("type the new word");
//}else {
//listFlag=false;
//}
//
//}
//
//
//for(Integer i =0 ;i<100;i++) {
//	try {
//
//	File createPdf = new File("FileNo"+(i.toString())+".pdf");
//
//    if (createPdf.createNewFile()) {
//        System.out.println("File created: " + createPdf.getName());
//      } else {
//        System.out.println("File already exists.");
//        System.out.println( createPdf.getPath());
//       
//      }
//	}
//catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//
//	 FileWriter  writeToPDF = new FileWriter("FileNo"+(i.toString())+".pdf");
//	 int index = random.nextInt(usersInput.size());
//	
//	 writeToPDF.write(usersInput.get(index));
//
//	 writeToPDF.close();
//}
//
//}