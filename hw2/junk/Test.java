import java.io.*;
import java.util.Scanner;

public class Test{

    public static void main(String [] args){
	File newFile = new File("in1.txt");

	try{
	    Scanner input = new Scanner(newFile);
	    while(input.hasNextLine()){
		System.out.println(input.nextLine());
	    }
	}catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
	
    }
}

