import java.util.Scanner;
import java.io.*;

public class In3{

    //uses leakyStack

    public static Scanner getIn3Input(){
	File newFile = new File("in3.txt");
	Scanner given = null;

	try{
	    given = new Scanner(newFile);
	} catch(FileNotFoundException e){
	    System.out.println("File Not Found");
	}
	
	return given; 
    }

    public static void main(String [] args){
       	Scanner input = getIn3Input();
	int cases;
	cases = Integer.parseInt(input.nextLine());

	for(int i = 0; i < cases; i++){
	    int stackCap;
	    String[] ops;

	    stackCap = Integer.parseInt(input.nextLine());
	    ops = input.nextLine().split(" ");

	    System.out.println("StackCap: " + stackCap);
	    System.out.print("Operations: ");
	    for(int j = 0; j < ops.length; j++){
		System.out.print(ops[j] + " ");
	    }
	    System.out.println();
	    
	    LeakyStack thing = new LeakyStack(stackCap); 
	
	    for(int j = 0; j < ops.length; j++){
		thing.push(ops[j]);
	    }
	    System.out.print("Resulting Stack: ");
	    thing.output();
	    System.out.println();

	}
	
    }
}
