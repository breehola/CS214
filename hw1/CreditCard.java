//package hw.cse214.cc;
import java.util.Calendar;
import java.util.Date;


public class CreditCard {

    private String creditCardNumber;
    private String cardHolderName;
    private String bank;
    private int limit;
    private double balance;

    public CreditCard(String creditCardNumber, String cardHolderName,
		      String bank, int limit, double balance) {
	this.creditCardNumber = creditCardNumber;
	this.cardHolderName = cardHolderName;
	this.bank = bank;
	this.limit = limit;
	this.balance = balance;

    }

    public String getCreditCardNumber() {return creditCardNumber;}
    public String getCardHolderName() {return cardHolderName;}
    public String getBank() {return bank;}
    public int getLimit() {return limit;}
    public double getBalance() {return balance;}

    public boolean chargeIt(double price){
	if(price + balance > limit){
	    return false;
	} else {
	    balance += price;

	    return true;
	}
    }

    public boolean payment(double amount){
	Date currDate = new Date();
	Calendar c = Calendar.getInstance();
	c.setTime(currDate);
	int month = c.get(Calendar.MONTH);
	int year = c.get(Calendar.YEAR);
	int day = c.get(Calendar.DAY_OF_MONTH);
	System.out.println("c: " + month + " " + day + " " + year);	

	Calendar dueCal = Calendar.getInstance();
	dueCal.set(Calendar.YEAR, year);
	dueCal.set(Calendar.MONTH, month);
	dueCal.set(Calendar.DAY_OF_MONTH, 15);
	System.out.println("dueCal: " + dueCal.get(Calendar.MONTH) + " " + dueCal.get(Calendar.DAY_OF_MONTH) + " " + dueCal.get(Calendar.YEAR));
	if((balance > 0) && c.after(dueCal)){
	    balance += 25; //arbitrary amount 
	}
	if(amount <= balance){	
	    balance -= amount;
	    return true;
	}
	return false;
	
    }

    @Override
    public String toString() {
	return "CreditCard [creditCardNumber=" + creditCardNumber
	    + ", cardHolderName=" + cardHolderName + ", bank=" + bank
	    + ", limit=" + limit + ", balance=" + balance + "]";
    }

    
}
