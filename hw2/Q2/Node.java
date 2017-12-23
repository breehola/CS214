public class Node<T>{
    
    private T data;
    private Node<T> link;

    public Node(){
	data = null;
	link = null;
    }

    public Node(T item, Node<T> linkData){
	data = item;
	link = linkData;
    }

    public T getData(){
	return data;
    }

    public void setData(T item){
	data = item;
    }

    public Node<T> getLink(){
	return link;
    }
    
    public void setLink(Node<T> nextNode){
	link = nextNode;
    }

}
