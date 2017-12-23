public class WhiteWalker{

    private int power;
    private int index; //original index

    public WhiteWalker(int pow, int i){
	power = pow;
	index = i;
    }

    public int getIndex(){
	return index;
    }

    public void setPower(int m){
	power = m;
    }

    public int getPower(){
	return power;
    }

    public String toString(){
	return "" + power;
    }
}
