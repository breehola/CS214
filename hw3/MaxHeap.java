import java.util.*;

public class MaxHeap{

    private int[] arr;
    private int size;
    private int maxSize;

    public MaxHeap(int n){
	arr = new int[n];
	size = 0;
	maxSize = n-1;
    }

    public boolean isEmpty(){
	return size == 0;
    }


    public void insert(int item){
	int position;
	arr[size] = item;
	size++;
	position = size-1;
	while((position > 0) && arr[position] > arr[(position -1)/2]){
	    int temp = arr[position];
	    arr[position] = arr[(position-1)/2];
	    arr[(position-1)/2] = temp;
	    position = (position-1)/2;
	}
    }

    public int deleteMax(){
	if (isEmpty()) throw new NoSuchElementException("eception");
	int answer = arr[0];
	arr[0] = arr[size-1];
	arr[size-1] = 0;
	size--;
	heapify();
	return answer;
    }

    public void heapify(){
	int currPos = 0;
	int childPos;
	while(currPos*2 +1 < size){
	    childPos = currPos * 2 + 1;
	    if(childPos < maxSize -1 && arr[childPos] < arr[childPos +1])
		childPos++;
	    if(arr[childPos] <= arr[currPos])
		return;
	    int temp = arr[childPos];
	    arr[childPos] = arr[currPos];
	    arr[currPos] = temp;
	    currPos = childPos;
	}
    }

    public void output(){
	for(int i = 0; i < size; i++){
	    System.out.println(arr[i]);
	}
    }
    
}
