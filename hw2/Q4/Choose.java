import java.util.Arrays;

public class Choose{

    private ArrayQueue walkerPow;
    private int n;

    public Choose(ArrayQueue given, int numberToChoose){
	walkerPow = given;
	n = numberToChoose;
    }

    public int findMax(WhiteWalker[] given){//returns index in given
	int currMax = 0;
	for(int i = 1; i < given.length; i++){
	    if (given[i] != null && given[currMax] != null && (given[i].getPower() > given[currMax].getPower())){
		currMax = i;
	    }
	}
	return currMax;
    }

    
    public void theChoosing(){
       	for(int j = 0; j < n; j++){
	 
	    WhiteWalker[] temp;
	    if(walkerPow.getLength()< n)
		temp = new WhiteWalker[walkerPow.getLength()];
	    else
		temp = new WhiteWalker[n];

	    int small = (Math.min(n ,walkerPow.getLength()));
	    for(int i = 0; i < small; i++){
		temp[i] = walkerPow.dequeue();
	    }


	    int ind = findMax(temp);	

	    System.out.print(temp[ind].getIndex() + " ");

	    for(int i = 0; i < temp.length; i++){
		if(i != ind){
		    if(temp[i].getPower() > 0)
			temp[i].setPower(temp[i].getPower() - 1);

		    walkerPow.enqueue(temp[i]);


		}
	    }


       	}
    }
    
}
