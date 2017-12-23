import java.io.*;
import java.util.Scanner;
import java.util.List;

public class EliminatePlayers{

    public static Scanner getInput(){
	File newFile = new File("in2.txt");
	Scanner given = null;
	try{
	    given = new Scanner(newFile);
	    
	} catch(FileNotFoundException e){
	    System.out.println("File not Found");
	}
	return given;
    }

    public static void main(String [] args){

	Scanner input = getInput();

	int cases;
	cases = Integer.parseInt(input.nextLine());

	for(int j = 0; j < cases; j++){
	    LinkedList<Player> players = new LinkedList<Player>();
	    String[] playerNums;//worry not.these will eventually be converted to ints
	    String[] playerHeights;


	    playerNums = input.nextLine().split(" ");
	    playerHeights = input.nextLine().split(" ");

	    Player[] listOfPlayers = new Player[playerNums.length];

	    for(int i=0; i< playerNums.length; i++){
		listOfPlayers[i] = new Player(Integer.parseInt(playerNums[i]), Integer.parseInt(playerHeights[i]));
	    }

	    
	    for(int i = listOfPlayers.length-1; i >= 0; i--){
		players.addToStart(listOfPlayers[i]);
	    }

	    System.out.println("Original List: ");
	    players.outputList();

	    Node<Player> curr = players.getHead();
	    Node<Player> next = curr.getLink();

	    while(next.getData() != null){
		if(curr.getData().getHeight() < next.getData().getHeight()){
		    players.deleteNext(curr);
		}
		curr = next;
		next = next.getLink();
	    }
	    System.out.println("Revised List: "); 
	    players.outputList();
	}
    }
}
