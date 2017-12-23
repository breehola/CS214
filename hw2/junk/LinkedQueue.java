public class LinkedQueue<T>{

    private Node<T> first;
    private Node<T> last;

    public LinkedQueue(){
	first = last = null;
    }

    public Node<T> getFront(){
	return first;
    }

    public boolean isEmpty(){
	return first == null;
    }
    
    public void enqueue(T item){
	if(isEmpty())
	    first = new Node<T>(item, last);
	else{
	    last = new Node<T>(item, null);
	    last = last.getLink();
	}
    }

    public T dequeue(){
	T temp = first.getData();
	first = first.getLink();
	return temp;
    }

    public void outPut(){
	
	Node<T> pos = first;
	while(pos != null){
	    System.out.print(pos.getData());
	    pos = pos.getLink();
	    System.out.print("H");
	}
	System.out.println();
    }
    
}
