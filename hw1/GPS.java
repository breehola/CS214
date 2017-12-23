public class GPS{

    private Location currLocation;
    private Location destination;
    private double speed;
    
    public GPS(){
	currLocation = new Location();
	destination = new Location();
	speed = 0;
    }

    public void setCurrentLocation(Location curr){
	currLocation = curr;
    }

    public void setDestination(Location dest){
	destination = dest;
    }

    public double calculatedDistance(){
	return Math.sqrt(Math.pow((destination.getY() - currLocation.getY()), 2)+Math.pow((destination.getX()- currLocation.getX()), 2));
    }

    public void setSpeed(double x){
	speed = x;
    }

    public double getSpeed(){
	return speed;
    }

    public double getArrivalTime(){
	return calculatedDistance()/getSpeed();
    }
}
