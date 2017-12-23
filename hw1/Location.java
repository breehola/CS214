public class Location{

    private int xCoor;
    private int yCoor;

    public Location(){
	xCoor = yCoor = 0;
    }

    public Location(int x, int y){
	xCoor = x;
	yCoor = y;
    }

    public int getX(){
	return xCoor;
    }

    public int getY(){
	return yCoor;
    }

    public String toString(){
	return "Location: " + "(" + xCoor + ", " + "yCoor" + ")";
    }
    
    
}
