import java.util.*;

public class Test{
    
    //for debugging purposes
    public static void printList(ArrayList<Integer> given){
	for(int i = 0; i < given.size(); i++){
	    System.out.print(given.get(i) + " ");
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
	int min = 0;
	for(int i = 1; i < unvis.size(); i++){
	    int n = unvis.get(i);//an index value
	    System.out.println("N: " + n);
	    if(dist[n] < dist[min]){
		min = n;
		System.out.println("min: " + min);
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

    public static void main(String [] args){
	ArrayList<Integer> thing = new ArrayList();
	for(int i = 3; i > 0; i--){
	    thing.add(i);
	}
	printList(thing);

	int[] dist = {4, 2, 6};
	printArr(dist);

	System.out.println(findIndexWithMin(thing, dist));
	System.out.println(find(thing, 2));
    }
}
