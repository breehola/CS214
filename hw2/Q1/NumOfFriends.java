import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

//if you're asking yourself if I imported built in class, yes, yes I did.
//but i did try writing my own before employing the last resort
//:'(
//i mean this doesnt even work lmao (the outputs are all wrong)
//it does give you three outputs :)

public class NumOfFriends{ 



    //names and numMutuals must be the same length
    public static Friend[] createFriendArr(String[] names, int[] nMutuals){
	Friend[] friendArr = new Friend[names.length];
	for(int i = 0; i < names.length; i++){
	    friendArr[0] = new Friend(names[i], nMutuals[i]);		 
	}
	return friendArr;
    }

    public static void insertion(Friend[] given){
	for(int i = 1; i< given.length; i++){
	    for(int j = i; j > 0; j--){
		if(given[j].compareTo(given[j-1]) < 0){
		    Friend temp = given[j];
		    given[j] = given[j-1];
		    given[j-1] = temp;
		}
	    }
	}
    }

    //assume sorted array
    public static int calcRange(Friend[] given, int k){
	float range = given[given.length-1].getMutuals() - given[0].getMutuals() + 1;
	return (int)(Math.round(range/k));
    }



    public static Friend kill(QueueList<Friend> given, int k){

	if(given.length() == 0)
	    return null;
	int count = 0;
	while(given.length() > 1){

	    if(count < k){
		given.enqueue(given.dequeue());

		count++;
	    } else {
		given.dequeue();
		count = 0;
		System.out.println(given.length());
	    }
	}
	return given.dequeue();
    }

    public static Scanner getsInput(){
	File newFile = new File("in1.txt");
	Scanner given = null;
	
	try{
	    given = new Scanner(newFile);
	} catch(FileNotFoundException e){
	    System.out.println("File not Found");
	}
	return given;
    }
    
    
    public static void main(String [] args){
	int testCases, n, k;
	String[] givenNames;
	int[] givenMutuals;

	Scanner input = getsInput();


	testCases = Integer.parseInt(input.nextLine());
	String[] nAndk = input.nextLine().split(" ");
	n = Integer.parseInt(nAndk[0]);
	k = Integer.parseInt(nAndk[1]);

	givenNames = input.nextLine().split(" ");

	    	    
	String[] tempMut = input.nextLine().split(" ");

        givenMutuals = new int[tempMut.length];
	    
	for(int i = 0; i < tempMut.length; i++){
	    givenMutuals[i] = Integer.parseInt(tempMut[i]);
	}

	Friend[] friendArr = new Friend[givenNames.length];
	for(int i = 0; i < friendArr.length; i++){
	    friendArr[i] = new Friend(givenNames[i], givenMutuals[i]);
	}

	insertion(friendArr);
	System.out.println(Arrays.toString(friendArr));

	//at this point, testCases, n, k, givenNames, givenMutuals, and friendArr are all initialized and they work

        int bucketRng = calcRange(friendArr, k);
	System.out.println(bucketRng); //this prints out three. pls take my word for it

	//fam at least i got the range right, right? (pls give me points for this lol)

	int min = friendArr[0].getMutuals();

	int max = friendArr[friendArr.length-1].getMutuals();



	for(int i = min; friendArr[i].getMutuals() < i + bucketRng-1; i+=bucketRng-1){
	    QueueList<Friend> temp = new QueueList();
	    temp.enqueue(friendArr[i]);
	    Friend huh = kill(temp, k);
	    System.out.println(huh);
	}
	
	
    } 
}
