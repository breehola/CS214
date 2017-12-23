public class LeakyStack{

    private int cap;
    private String[] operations;
    private int top; //where top is the "uppermost" position that is filled?
    private int bottom;

    public LeakyStack(int capacity){
	cap = capacity;
	operations = new String[cap];
	top = bottom = 0;
    }

    public boolean isEmpty(){
	return (operations[top] == null);
    }

    public boolean isFull(){
	return ((top + 1) % cap == bottom);
    }
    
    public void push(String item){
	if(isFull()){
	    top = bottom;
	    bottom = (bottom + 1) % cap;
	}else if(isEmpty()){
	    operations[top] = item;//top == bottom
	}else {
      	    top = (top + 1) % cap;
	}
	operations[top] = item;
	
    }

    public String pop(){
	String temp = operations[top];
	operations[top] = null;
	top = top--;
	return temp;
    }

    public void output(){
	if (top == cap-1){
	    for(int i = top; i >= bottom; i-- ){
		System.out.print(operations[i] + " ");
	    }
	    System.out.println();
	} else {
	    for(int i = top; i >= 0; i--){
		System.out.print(operations[i] + " ");
	    }
	    for(int i = cap-1; i > top; i--){
		System.out.print(operations[i] + " ");
	    }
	    System.out.println();
	}
    } 

}
