import java.util.Arrays;

public class ArrayQueue{

    private int capacity;
    private WhiteWalker[] arr;
    private int front, back;
    private int count;


    public ArrayQueue(int cap){
	capacity = cap;
	arr = new WhiteWalker[capacity];
	front = back = 0;
	count = 0;
    }

    public WhiteWalker getFront(){
	return arr[front];
    }

    public WhiteWalker getBack(){
	return arr[back];
    }

    public int getLength(){
	return count;
    }

    public boolean isEmpty(){
	return count==0;
    }

    public void enqueue(WhiteWalker item){



	if (count == 0) {
	    arr[back] = item;
	}
	else {
	    back++;
	    if (back >= capacity) {
		back = 0;
	    }
	    arr[back] = item;
	}
	count++;
    }

    public WhiteWalker dequeue(){
	WhiteWalker temp = arr[front];
	arr[front] = null;
	if (count != 1) {
	    front++;
	}
	if(front >= capacity)
	    front = 0;
	count--;
	return temp;
    }

    public String toString(){
	return Arrays.toString(arr);
    }
    
    public void outPut(){
	System.out.print("[");
	if(front == 0){
	    for(int i = 0; i <= back; i++){
		
		System.out.print(arr[i] + ", ");
	    }
	} else{
	    
	    for(int i = front; i < capacity; i++){
		System.out.print(arr[i] + " ");
	    }
	    for(int i = 0; i <= back; i++){
		System.out.print(arr[i] + " ");
	    }
	}
	System.out.print("]");
	System.out.println();

    }
}
