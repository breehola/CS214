import java.util.*;

public class QueueList<T>{

    private LinkedList<T> queue;


    public QueueList(){
	queue = new LinkedList<T>();
    }

    public T peek(){
	return ((queue.getFirst()));
    }

    public int length(){
	return queue.size();
    }

    public boolean isEmpty(){
	return queue.size() == 0;
    }

    public void enqueue(T item){
	queue.add(item);
	// queue.addToEnd(item);
    }

    public T dequeue(){
	if(isEmpty()){
	    throw new NoSuchElementException("No Such Exception");
	}
	return queue.remove(0);
        // return queue.deleteHeadNode();
	
    }

    public String toString(){
	return "";
	// Node<T> pos = queue.getFirst();
	// String ans = " ";
	// while(pos != null){
	//    ans += pos.getData() + " ";
	//     pos = pos.getLink();
	// }
	// return ans;
    }
}
