package collage;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
public class fileRW {

static void createFile(String fileName) {

	 try {
	      File ff = new File("C:\\Users\\Lenovo\\Desktop\\"+fileName+".txt");
	     
	      if (ff.createNewFile()) {
	        System.out.println("File created: " + ff.getName());
	      } else {
	        System.out.println("File already exists.");
	        System.out.println( ff.getPath());
	       
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
}

static void readFile() {}


}
