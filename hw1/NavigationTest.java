//package hw.cse214.navigation;

public class NavigationTest {
    
    public static void main(String[] args) {
	
	Location myCurrentLocation = new Location(0, 500);
	Location myDestination = new Location(0, 200);

	Vehicle  myCar = new Vehicle();

	/*
	 * Initializing GPS object and setting current and destination locations
	 */
	GPS myGPS = new GPS();

	myGPS.setCurrentLocation(myCurrentLocation);
	myGPS.setDestination(myDestination);
	myCar.setGPS(myGPS);

	/*
	 *Start the car and set current speed
	 */
	myCar.setCurrentSpeed(10.0);

	//see output
	System.out.println("Distance: " + ((GPS) myCar.getGPS()).calculatedDistance());
	System.out.println("Arrival : " + ((GPS) myCar.getGPS()).getArrivalTime());
    }
    //should print 300 and 30
}
