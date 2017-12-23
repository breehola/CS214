import java.util.Scanner;
import java.io.*;

public class In2{

    public static Scanner getInput(String fileName){
	Scanner thing = null;
	File newFile = new File(fileName);

	try{
	    thing = new Scanner(newFile);
	}catch(FileNotFoundException e){
	    System.out.println("File Does Not Exist");
	}
	return thing;
    }

    

    public static void main(String[] args){
	Scanner input = getInput("in2.txt");
	String[] temp = input.nextLine().split(" ");

	int m = Integer.parseInt(temp[0]);
	int n = Integer.parseInt(temp[1]);

	String[] temp1 = input.nextLine().split(" ");
	int[] emptySeats = new int[m];

	for(int i = 0; i < m; i++){
	    emptySeats[i] = Integer.parseInt(temp1[i]);
	}

	MaxHeap thing = new MaxHeap(m);
        for(int i = 0; i < m; i++)
	    thing.insert(emptySeats[i]);

	int sum = 0;
	for(int i = 0; i < n; i++){
	    int cost = thing.deleteMax();
	    sum += cost;
	    cost--;
	    thing.insert(cost);
	}

	System.out.println(sum);
	
    }

}
