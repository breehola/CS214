public class Sums{

    public static String sumOfTwoExists(int[] given, int givenSum){

	for(int i = 0; i < given.length; i++){

	       for(int j = i+1; j < given.length; j++){
		   
		   if (given[i] + given[j] == givenSum){
		       return given[i] + " + " + given[j] + " = " + givenSum + ", " + "true";
		}
	           }
	   
        }
	return "false";
    }
    //o(n^2)

   


    public static String sumOfThreeExists(int[] given, int key){

	for(int i = 0; i < given.length; i++){
	 

	    for(int j = i+1; j < given.length; j++){
        

		for(int k = j+1; k < given.length; k++){

		    if (given[i] + given[j] + given[k] == key){
		
			return given[i] + "+" + given[j] + "+" + given[k] + "=" + key + ", " + "true"; 
		    }
		}
	    }
	}
	return "false";
    }
    //O(n^3)

    public static void main(String [] args){
	
	int[] arr = {11, 15, 6, 8, 9, 10};
	System.out.println(sumOfTwoExists(arr, 17));//true
	System.out.println(sumOfTwoExists(arr, 27));//false
	System.out.println(sumOfThreeExists(arr, 25));///true
	System.out.println(sumOfThreeExists(arr, 39));
    }
    
}
