import java.util.*;
import java.io.*;

public class In1{

    public static Scanner getInput(String txt){
	Scanner given = null;
	File newFile = new File(txt);

	try{
	    given = new Scanner(newFile);
	}catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
	return given;
    }

    public static void print(int [][] given){
	for(int i = 0; i < given.length; i++){
	    for(int j = 0; j < given.length; j++){
		System.out.print(given[i][j] + ", ");
	    }
	    System.out.println();
	}
	System.out.println();
    }

    public static boolean isPath(int[][] pris, int x, int y){
        if ((x < pris.length && y < pris.length) && (x >= 0 && y >= 0))
	    if (pris[x][y] == 0) return true;
	return false;
    }

    public static int numberOfPaths(int [][] given, int x, int y, int n){
	//entrance and exit are blocked off
       	if(given[0][0] == 1 || given[n-1][n-1] == 1)
		return 0; 


	int count = 0;
	//base case?
	if(x == (n-1) && y ==(n-1)){
	    count++;
	    return count;
	}
	//mark as visited
	given[x][y] = 2;
	
	//left
	if(isPath(given, x-1, y)){
	    count += numberOfPaths(given, x-1, y, n);
	    given[x-1][y] = 0;
	}

	//right
	if(isPath(given, x+1, y)){
	    count += numberOfPaths(given, x+1, y, n);
	    given[x+1][y] = 0;
	}

	//down
	if(isPath(given, x, y-1)){
	    count += numberOfPaths(given, x, y-1, n);
	    given[x][y-1] = 0;
	}

	//up
	if(isPath(given, x, y+1)){
	    count += numberOfPaths(given, x,  y+1, n);
	    given[x][y+1] = 0;
	}
	return count;
    }

    public static void main(String [] args){
	Scanner input = getInput("in1.txt");
	String temp = input.nextLine();
	int m = Integer.parseInt(temp);

	for(int i = 0; i < m; i++){
	    String temp2 = input.nextLine();
	    int n = Integer.parseInt(temp2);

	    int[][] prison = new int[n][n];

	    for(int j = 0; j < n; j++){
		String [] thing = input.nextLine().split(" ");
		for(int k = 0; k < n; k++){
		    prison[j][k] = Integer.parseInt(thing[k]);
		}
	    }

	    System.out.println(numberOfPaths(prison, 0, 0, n));

	}
    }
}
