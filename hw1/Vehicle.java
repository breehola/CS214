public class Vehicle{
    
    private GPS aGPS;
    private double currentSpeed;

    public Vehicle(){
	aGPS = new GPS();
	currentSpeed = 0;
    }

    public void setCurrentSpeed(double speed){
	currentSpeed = speed;
	aGPS.setSpeed(speed);
    }

    public GPS getGPS(){
	return aGPS;
    }

    public void setGPS(GPS someGPS){
	aGPS = someGPS;
    }
}
