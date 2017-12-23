public class Player{

    private int number;
    private int height;
    
    public Player(int jNumber, int playerHeight){
	number = jNumber;
	height = playerHeight;
    }

    public int getNumber(){
	return number;
    }

    public int getHeight(){
	return height;
    }
    public String toString(){
	return number + ""; 
    }
   
}
