package collage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		List<school> schoolList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

boolean flag=true;


			while(flag) {
				int schoolIndex = 0;
				boolean schoolFlag = true;
				System.out.println("do you want to create sschool system y/n");
				if(sc.nextLine().equals("y")) {
					
				}
				
				else {
					flag=false;
					System.out.println("bye");
				}
				
				
			}
		
	}
}