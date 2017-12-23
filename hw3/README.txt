Q1.
In1.java
	-Scanner getInput(String fileName) 
	-int sort(ArrayList<Integer> given)
	-void inOrder(int[] given, int n, int end, ArrayList<Integer> arrList)
	-void main(String [] args) - prints out number of swaps 
in1.txt
	-this is the file that the input goes in
	-format:
		n (number of nodes)
		x[1] x[2] ... x[n] (the values of the nodes, separated by a space)
		
	-must be formatted this way

-------------------------
Q2. 
MaxHeap.java
	-MaxHeap(int n) - constructor, where n is the capacity
	-boolean isEmpty()
	-void insert(int item)
	-int deleteMax() - removes max value and returns it
	-void output()
In2.java
	-Scanner getInput(String fileName)
	-void main(String [] args) -  prints out max dollars
in2.txt
	-this is the file that the input goes in
	-format: 
		m n (separated by a space)
		x[i] x[2] ... x[m] (separated by spaces)
		
		first line: m denotes the number of rows and n denotes the number of people in line
		second line: the number of empty seats at the start in each of the m rows
	-must be formatted correctly.  (don't add unnecessary spaces or anything otherwise everything will be bad and it wont be my fault)