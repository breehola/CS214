import java.util.*;
import java.io.*;

public class In1{

    public static Scanner getInput(String txt){
	Scanner given = null;
	File newFile = new File(txt);
	try{
	    given = new Scanner(newFile);
	}catch(FileNotFoundException e){
	    System.out.println("FILE NOT FOUND");
	}
	return given;
    }


    
    public static String twoSum(int num, int targetSum, int[] arr, HashMap<Integer, Integer> given){
	int index1, index2;
	index1 = -1;
	index2 = -1;
	for(int i = 0; i < num; i++){
	    if(given.containsKey(targetSum - arr[i])){
		int index1Val = arr[i];
		int index2Val = targetSum - arr[i];
		index1 = Math.min(given.get(index1Val), given.get(index2Val));
		index2 = Math.max(given.get(index1Val), given.get(index2Val));;
	    }
	}
	if(index1==index2)
	    index1 = index2 = -1;
	return "[" + index1 + ", " + index2 + "]";
    }
    
    public static void main(String [] args){
	Scanner input = getInput("in1.txt");
	String [] nAndM = input.nextLine().split(" ");
	int n = Integer.parseInt(nAndM[0]);
	int m = Integer.parseInt(nAndM[1]);
	String[] values = input.nextLine().split(" ");
	int[] valueArr = new int[n];
        HashMap<Integer, Integer> thing = new HashMap();
	for(int i = 0; i < n; i++){
	    int temp = Integer.parseInt(values[i]);
	    valueArr[i] = temp;
	    thing.put(temp, i);
	}

	System.out.println(twoSum(n, m, valueArr, thing));
	
    }
}
