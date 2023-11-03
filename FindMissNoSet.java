package week4.assign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindMissNoSet {

	public static void main(String[] args) {
		int missing = 0;

		Set<Integer> value= new LinkedHashSet<Integer>();
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(5);
		value.add(6);
		value.add(7);
		value.add(8);
		value.add(9);
		value.add(10);
		System.out.println(value);
		int temp=1;
		for (Integer number : value) {

		if(number != temp)
		{
			missing= temp;
			break;
		}

		temp++;
			
		}
		System.out.println(temp);


	}

}
