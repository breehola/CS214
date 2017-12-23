public class LinkedList<T>{

    private Node<T> head;

    public LinkedList(){
	head = new Node();
    }

    public Node<T> getHead(){
	return head;
    }
    
    public void addToStart(T item){
	head = new Node(item, head);
    }

    public boolean deleteHeadNode(){
	if(head != null){
	    head = head.getLink();
	    return true;
	}
	return false;
    }

    public boolean deleteNext(Node<T> given){
	if(given.getLink() != null){
	    given.setLink(given.getLink().getLink());
	    return true;
	}
	return false;
    }
    
    public int size(){
	int count = 0;
	Node<T> copy = head;

	while(copy != null){
	    count++;
	    copy = copy.getLink();
	}
	return count;
    }

    public boolean contains(T item){
	return (find(item) != null);
    }

    public Node<T> find(T target){
	Node<T> copy = head;

	while(copy != null){
	    if(copy.getData().equals(target))
		return copy;
	    copy = copy.getLink();
	}
	return null;
    }

    public void outputList(){
	Node<T> copy = head;
	while(copy.getLink() != null){
	    System.out.print(copy.getData() + " ");
	    copy = copy.getLink();
	}
	System.out.println();
    }
}
