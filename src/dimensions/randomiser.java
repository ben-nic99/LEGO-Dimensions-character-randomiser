package dimensions;


import java.util.ArrayList;
import java.util.Random;

public class randomiser {			//generate the random item when given list to choose from

	public static  String randomise(ArrayList<String> array){	
			int index = new Random().nextInt(array.size());		//generate random int of the array size
		
			return (array.get(index)); 							//return string at that position of the array
		}
}

