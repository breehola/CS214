import java.util.*;
import java.io.*;

public class In1{

    public static Scanner getInput(String fileName){
	Scanner thing = null;
	File newFile = new File(fileName);

	try{
	    thing = new Scanner(newFile);
	}catch(FileNotFoundException e){
	    System.out.println("FILE DOES NOT EXIST GRR");
	}
	return thing;
    }

    
    public static int sort(ArrayList<Integer> given){
	int count = 0;
        for(int i= 0; i < given.size(); i++){
	    int currMinIndex = i;
	    for(int j = i+1; j < given.size(); j++){
		if(given.get(j).intValue() < given.get(currMinIndex).intValue())
		    currMinIndex = j;
	    }
	    if(currMinIndex != i)
		count++;
	    given.set(currMinIndex, given.set(i, given.get(currMinIndex)));
	    
	}
	return count;
    }



    public static void inOrder(int[] given, int n, int end, ArrayList<Integer> arrList){

	if (n> end)
	    return;
	
	inOrder(given, 2*n+1, end, arrList);

	arrList.add(given[n]);

	inOrder(given, 2*n+2, end, arrList);
	    
	
       
    }

    public static void main(String [] args){
	Scanner input = getInput("in1.txt");
	int n = Integer.parseInt(input.nextLine());

	String [] temp = input.nextLine().split(" ");
	int [] arr = new int[temp.length];
	
	for(int i = 0; i < temp.length; i++){
	    arr[i] = Integer.parseInt(temp[i]);
	}

	ArrayList<Integer> thing = new ArrayList(arr.length);

        inOrder(arr, 0, arr.length-1, thing);

       	
	
	System.out.println("Minimum number of swaps: " + sort(thing));

     
	    
    }
	
}
    

