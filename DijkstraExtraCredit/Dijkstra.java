import java.util.*;
import java.io.*;

public class Dijkstra{

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

    //for debugging purposes
    public static void printList(ArrayList<Integer> given){
	for(int i = 0; i < given.size(); i++){
	    System.out.print(given.get(i) + " ");
	}
	System.out.println();
    }

    //for debugging purposes
    public static void print2D(int[][] given){
	for(int i = 0; i < given.length; i++){
	    for(int j = 0; j < given.length; j++){
		System.out.print(given[i][j] + " ");
	    }
	    System.out.println();
	}
	System.out.println();
    }

    //for debugging purposes
    public static void printArr(int[] given){
	for(int i = 0; i < given.length; i++){
	    System.out.print(given[i] + " ");
	}
	System.out.println();
	System.out.println();
    }

    public static int findIndexWithMin(ArrayList<Integer> unvis, int [] dist){
	int min = unvis.get(0);
	for(int i = 1; i < unvis.size(); i++){
	    int n = unvis.get(i);//an index value
	    if(dist[n] < dist[min]){
		min = n;
	    }
	}
	return min;
    }

    public static int find(ArrayList<Integer> given, int target){
	for(int i = 0; i < given.size(); i++){
	    if(given.get(i).equals(target)) return i;
	}
	return -1;
    }

    public static void Dijkstras(int[][] given, int sour, int des){
	//creates distance array and initializes
	int[] distance = new int[given.length];
	distance[sour] = 0;
	for(int i = 0; i < given.length; i++)
	    if(i != sour) distance[i] = Integer.MAX_VALUE;

	//creates visited arrayList
	ArrayList<Integer> visited = new ArrayList();
	
	//creates unvisited arrayList
	ArrayList<Integer> unvisited = new ArrayList();
	for(int i = 0; i < given.length; i++){
	    unvisited.add(i);
	}

	//another thing
	int[] prev = new int[given.length];

	//special case
	if(sour == des){
	    System.out.println(0);
	    System.out.println(sour);
	    return;
	}

	//everything else
	for(int i = 0; i < given.length; i++){
	    int next = findIndexWithMin(unvisited, distance);

	    visited.add(next);

	    int n = find(unvisited, next);

	    unvisited.remove(n);

	    for(int j = 0; j < unvisited.size(); j++){
		int tempDesVertex = unvisited.get(j);
		if(given[next][tempDesVertex] > 0){
		    if(distance[next] + given[next][tempDesVertex] < distance [tempDesVertex]){
			distance[tempDesVertex] = distance[next] + given[next][tempDesVertex];

			prev[tempDesVertex] = next;
		    }
		}
	    }
	}

	//creates arraylist to hold answer
	ArrayList<Integer> ans = new ArrayList();
	
	int u = des;

	ans.add(0, u); 
	while(u != 0){
	    ans.add(0, prev[u]);
	    u = prev[u];
	}
	
	System.out.print("path: ");
        for(int i = 0 ; i < ans.size()-1; i++){
	    System.out.print(ans.get(i) + "->");
	}
	System.out.println(ans.get(ans.size()-1));
	System.out.println("Answer: " + distance[des]);
    }
    
    public static void main(String [] args){
	Scanner input = getInput("in1.txt");
	int m = Integer.parseInt(input.nextLine());
	for(int i = 0; i < m; i++){
	    int n = Integer.parseInt(input.nextLine());
	    String[] temp = input.nextLine().split(" ");
	    int source = Integer.parseInt(temp[0]);
	    int dest = Integer.parseInt(temp[1]);
	    int[][] graph = new int[n][n];
	    for(int j = 0; j < n; j++){
		String[] t = input.nextLine().split(" ");
		for(int k = 0; k < n; k++){
		    graph[j][k] = Integer.parseInt(t[k]);
		}
	    }
	    Dijkstras(graph, source, dest);
	}
    }
}

