public class Friend implements Comparable<Friend>{

    private String name;
    private int mutuals;

    public Friend(String givenName, int numMutuals){
	name = givenName;
	mutuals =  numMutuals;
    }

    public String getName(){
	return name;
    }

    public int getMutuals(){
	return mutuals;
    }

    public String toString(){
	return name + " " +  mutuals;
    }

    public int compareTo(Friend rhs){
	if(mutuals > rhs.mutuals)
	    return 1;
	else if(mutuals < rhs.mutuals)
	    return -1;
	else
	    return 0;
    }
    
}
