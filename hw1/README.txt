HOMEWORK 1 (due 9/18/17)

Files included in the .zip
-Sums.java
-CreditCard.java
-TestCreditCard.java
-Card.java
-Player.java
-CardSortingTest.java
-Location.java
-GPS.java
-Vehicle.java
-NavigationTest.java

-problem1complexity.pdf
---------------------


--------------------
Sums.java 

Includes:
	-static String sumOfTwoExists(int [] given, int givenSum) --given an array of integers and an integer, checks if any two integers in the array sums to the given integer
	-static String sumOfThreeExists(int [] given, int givenSum) --given an array of integers and an integer, checks if any three integers in the array sum to the given integer
	-static void main(String [] args) --main method is included in Sums.java, values can be altered and tested in the main method

--------------------


---------------------
CreditCard.java 

Includes
	 -CreditCard(String creditCardNumber, String cardHolderName,
		      String bank, int limit, double balance) --constructor

	-String getCreditCardNumber() --returns creditCardNumber
	-String getCardHolderName() --returns cardHolderName
	-String getBank() --returns bank
	-int getLimit() --returns limit
	-double getBalance() --returns balance
	
	-boolean chargeIt(double price) --adds to balance. returns true if card is successfully charged, false if price would cause the balance to go over limit
	-boolean payment(double amount) --deducts amount from balance and returns true as long as payment is less than or equal to balance on card. Imposes a late fee if balance is positive after the 15th of the month. Dates are printed out. 

	-String toString() --returns string containing creditCardNumber, cardHolderName, bank, limit, and balance

-----------------------
TestCreditCard.java 

Includes: 
	-static void main(String [] args) --tests credit card, values can be tested and altered 
------------------------


-------------------------
Card.java

Includes:
	-card(String givenCard) --constructor
	-String getSuit() --returns suit
	-String getNumber() --returns number, A 2 3 4 5 6 7 8 9 10 J Q K 
	-int compareTo() --compares two Card objects, returns 1 if current card is greater than card passed as argument, -1 if card passed as argument is greater than current card

	-String toString() --returns card, ex. "S4"
--------------------------
Player.java

Includes: 
	-Player(int id) --constructor
	-void printCards() --prints player's cards
	-void setCards(Card[] givenCards) --sets players cards
	-void sortCards() --sorts player's hand using insertion sort
--------------------------
CardSortingTest.java

Includes: 
	-static void main(String[]args) --deals player a hand of cards, sorts them, values can be altered in file
-------------------------

-------------------------
Location.java 

Includes:
	-Location() --constructor, sets x and y to 0
	-Location(int x, int y) --overloads constructor, sets x and y to arguments passed
	-int getX() --returns x coordinate of Location
	-int getY() --returns y coordinate of Location
	-String toString() --returns String including x and y coordinates
-------------------------
GPS.java 

Includes: 
	-GPS() --constructor
	-void setCurrentLocation(Location curr) --sets Location to given Location 
	-void setDestination(Location dest) --sets destination to given Location
	-double calculatedDistance() --returns distance between destination and current location
	-void setSpeed(double x) --sets speed 
	-double getSpeed() --returns speed
	-double getArrivalTime() --return calculated arrival time based on calculated distance and speed
--------------------------
Vehicle.java 

Includes:
	-Vehicle() --constructor
	-void setCurrentSpeed(double speed) --sets speed of vehicle
	-GPS getGPS() --returns Vehicle's GPS
	-void setGPS(GPS someGPS) --assigns GPS to vehicle
-------------------------
NavigationTest.java 

Includes:
	-static void main(String [] args) --main method. values of destination, location, and speed can be altered and tested
--------------------------
