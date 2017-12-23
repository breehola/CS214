public class TestCreditCard{


    public static void main(String [] args){
	CreditCard visa = new CreditCard("12345", "Donkey Kong", "TDBank", 300, 17.35);
	System.out.println(visa);
	visa.chargeIt(3.47);
	System.out.println(visa);
	visa.payment(14.78);
	System.out.println(visa);
    }
}
