 public class Player{

    private int idNum;
    private Card[] cards;


    public Player(int id){
        idNum = id;
	cards = new Card[13];
    }

    public void printCards(){
        for(int i = 0; i < cards.length; i++){
	    System.out.print(cards[i] + " ");
	}
	System.out.println();
    }

    public void setCards(Card [] givenCards){
	for(int i = 0; i < cards.length; i++){
	    cards[i] = givenCards[i];
	}
    }
    
    //S > H > D > C
    //A > K > Q > J > 10 > 9 > 8> .... > 2
    public void sortCards(){
	for(int i = 1; i < cards.length; i++){

	    for(int j = i; j > 0; j--){
		if(cards[j].compareTo(cards[j-1]) < 0){
		    Card temp = cards[j];
		    cards[j] = cards[j-1];
		    cards[j-1] = temp;
		}
		   
	    }
	}
    }
 }




