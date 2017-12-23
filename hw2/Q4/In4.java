import java.util.Scanner;
import java.io.*; 

public class In4{

    public static Scanner getInput(){
	File newFile = new File("in4.txt");
	Scanner given = null;

	try{
	    given = new Scanner(newFile);
	}catch(FileNotFoundException e){
	    System.out.println("File Not Found");
	}

	return given;
    }


    public static void main(String [] args){
	Scanner input = getInput();
	int cases = Integer.parseInt(input.nextLine());

	for(int i = 0; i < cases; i++){
	    int m;//given
	    int n; //choose n from m
	    String[] temp = input.nextLine().split(" ");
	    m = Integer.parseInt(temp[0]); 
	    n = Integer.parseInt(temp[1]);
	    ArrayQueue walkers = new ArrayQueue(m);
	
	    String[] tempPow = input.nextLine().split(" ");

	  
	    for(int j = 0; j < tempPow.length; j++){
		WhiteWalker someThing = new WhiteWalker(Integer.parseInt(tempPow[j]), j);
	        walkers.enqueue(someThing);
	        
	    }

        

	    Choose test = new Choose(walkers, n);
	    test.theChoosing();

	    System.out.println();
	}
	
    }
}
