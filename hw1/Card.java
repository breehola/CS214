public class Card{

    private String card;

    public Card(String givenCard){
	card = givenCard;
    }

    public String getSuit(){
	return card.substring(0,1);
    }

    public String getNumber(){
	return card.substring(1);
    }

    public int compareTo(Card rhs){
	String numbers = "2345678910JQKA";
	if(getSuit().compareTo(rhs.getSuit()) > 0){ //this > rhs
	    return 1; //
	} else if (getSuit().compareTo(rhs.getSuit()) < 0){ //rhs > this
	    return -1; //
	} else { //suits are equal
	    //compare the number portion

	    if(numbers.indexOf(getNumber()) > numbers.indexOf(rhs.getNumber()))
		return 1; //this > rhs
	    else
		return -1; //rhs > this
	}
	
	
    }

    public String toString(){
	return card;
    }
}
