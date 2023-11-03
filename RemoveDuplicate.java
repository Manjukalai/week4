package week4.assign;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.math3.geometry.euclidean.threed.Line;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String input = "PayPal India";
		String replace = input.replace(" ","");
		char[] chArr = replace.toCharArray();
		
		Set<Character> name = new LinkedHashSet<Character>();
		for(int i=0; i<=chArr.length-1;i++)
		{
			name.add(chArr[i]);
		}
		System.out.println(name);
	}}
						
//				Declare a String as "PayPal India"

//				Convert it into a character array

//				Declare a Set as charSet for Character

//				Declare a Set as dupCharSet for duplicate Character

//				Iterate character array and add it into charSet

//				if the character is already in the charSet then, add it to the dupCharSet

//				Check the dupCharSet elements and remove those in the charSet

//				Iterate using charSet

//				Check the iterator variable isn't equals to an empty space

//				print it

		