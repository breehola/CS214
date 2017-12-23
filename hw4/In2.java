import java.util.*;
import java.io.*;

public class In2{

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

    public static int sumOfThree(int size, int mythicalCon, int[] valueArr){
	int[] rem = new int[size];
	for(int i = 0; i < size; i++){
	    rem[i] = valueArr[i]% mythicalCon;//array of remainders
	}

	HashMap<Integer, Integer> values = new HashMap(mythicalCon);
	for(int i = 0; i < size; i++){
	    if(values.containsKey(rem[i]))
		values.replace(rem[i], values.get(rem[i])+1);
	    else
		values.put(rem[i], 1);
	}

	System.out.println(values);
	int ans = 0;
	for(int i = 0; i < size; i++){
      	    values.replace(rem[i], values.get(rem[i])-1);
	    HashMap<Integer, Integer> copy = (HashMap) values.clone();
	    System.out.println(copy);
	    for(int j = i+1; j < size; j++){
		int target = (valueArr[i] + valueArr[j])% mythicalCon;
		if(values.containsKey(target)){
		    
		    values.replace(rem[j], values.get(rem[j])-1);
		    ans += values.get(target);
		}
		System.out.println("in " +values);

	    }
	    values = (HashMap)copy.clone();  
	    System.out.println("out" + values);
	}
	return ans;
    }

    public static void main(String [] args){
	Scanner input = getInput("in2.txt");
	String [] nAndM = input.nextLine().split(" ");
	String [] arr =  input.nextLine().split(" ");
	int n = Integer.parseInt(nAndM[0]);
	int m = Integer.parseInt(nAndM[1]);
	System.out.println(n);
	System.out.println(m);

	//maybe if the value has been checked already, dont fucking check it again?

	int[] intArr = new int[n];
	for(int i = 0; i < n; i++){
	    intArr[i] = Integer.parseInt(arr[i]);
	}



	

	System.out.println("number of combinations: " + sumOfThree(n, m, intArr));
    }
}
