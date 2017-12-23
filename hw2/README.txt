In1.java

-----------------------
Q2.
Player.java
	-constructor: Player(int jNumber, int playerHeight) - creates player object
	-int getNumber() - returns jersey number
	-int getHeight() - returns height associated with jersey number
	-String toString() - returns Player as a String (the jersey number)

EliminatePlayers.java
	-Scanner getInput() - (helper method) gets input from in2.txt, returns Scanner object
	-void main(String [] args) - takes input from text file and returns revised player list

in2.txt
	-line 1: test cases
	-line 2: jersey numbers separated by a space
	-line 3: heights separated by a space
	-example input:
		1
		1 2 3 4 5 6 7
		177 175 165 172 161 170 164
	-do not leave a blank line between test cases
	-number of jersey numbers must be equal to the number of heights

-----------------------
Q3.
LeakyStack.java
	-constructor: LeakyStack(int capacity)- takes capacity and creates LeakyStack object
	-boolean isEmpty() - returns true if stack is empty, false otherwise
	-boolean isFull() - returns true is stack is full, false otherwise
	-void push(String item) - pushes String item into stack
	-String pop() - removes top most String item, returns removes String
	-void output() - prints stack from top to bottom

In3.java
	-Scanner getIn3Input() -(helper method) gets input from in3.txt, returns Scanner object
	-void main(String [] args) - takes input from in3.txt, prints stack capacity, all pushed operations, and resulting stack after all operations are pushed. 

in3.txt
	-line 1: test cases
	-line 2: stack capacity
	-line 3: operations, each separated by a space
	-example: 
		1
		3
		op_one op_two op_three op_four op_five
	-do not include blank lines between test cases

---------------------------
Q4.
ArrayQueue.java (specific to WhiteWalker class)
	-constructor: ArrayQueue(int cap) - creates an ArrayQueue object with capacity cap
	-WhiteWalker getFront() -returns front of queue
	-WhiteWalker getBack() -returns back of queue
	-int getLength() - returns the number of elements in arrayqueue
	-boolean isEmpty() -returns true if arrayqueue is empty, false otherwise
	-void enqueue(WhiteWalker item) -enqueues element to back of queue 
	-WhiteWalker dequeue() - dequeues first element, returns removed element
	-String toString() - returns String
	-void outPut() - outputs arrayqueue from front to back
Choose.java
	
WhiteWalker.java
In4.java
in4.txt 
	line 1:tests case number