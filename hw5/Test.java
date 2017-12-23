import java.util.*;
import java.io.*;

public class Test{

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

    public static boolean isPath(int[][] pris, int x, int y){
        if ((x < pris.length && y < pris.length) && (x >= 0 && y >= 0))
	    if (pris[x][y] == 0) return true;
	return false;
    }



    public static void main(String [] args){
	Scanner input = getInput("in1.txt");
	String temp = input.nextLine();
	String temp2 = input.nextLine();
	int m = Integer.parseInt(temp);
        int n = Integer.parseInt(temp2);

	int[][] prison = new int[n][n];

	for(int j = 0; j < n; j++){
	    String [] thing = input.nextLine().split(" ");
	    for(int k = 0; k < n; k++){
		prison[j][k] = Integer.parseInt(thing[k]);
	    }
	}

	for(int i = 0; i < n; i++){
	    for(int j = 0; j < n; j++){
		System.out.print(prison[i][j] + ", ");
	    }
	    System.out.println();
	}

	System.out.println(isPath(prison, 0, 0));
    }

    
}
