import java.util.Scanner;
import java.io.*;

public class In3{

    public static Scanner getInput(String txtName){
	Scanner given = null;
	File newFile = new File(txtName);

	try{
	    given = new Scanner(newFile);
	}catch (FileNotFoundException e){
	    System.out.println("File Not Found");
	}
	return given;
    }

    public static void main(String [] args){
	Scanner input = getInput("in3.txt");
	int q = Integer.parseInt(input.nextLine());
	for(int i = 0; i < q; i++){
	    String[] temp = input.nextLine().split(" ");
	    int n = Integer.parseInt(temp[0]);
	    if(n==1)
		System.out.println("Insert");
	    else if(n==2)
		System.out.println("Delete");
	    else if(n==3)
		System.out.println("Search");
	    else if(n==4)
		System.out.println("inOrder");
	    else if(n==5)
		System.out.println("preorder");
	    else if(n==6)
		System.out.println("postorder");
	    
	}
    }
}
