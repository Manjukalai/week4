package week4.assign;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateSetList {

	public static void main(String[] args) {
		
		List<Integer> integer = new ArrayList<Integer>();
		integer.add(1);
		integer.add(2);
		integer.add(3);
		integer.add(5);
		integer.add(2);
		integer.add(5);
		integer.add(7);
		integer.add(8);
		integer.add(9);
		integer.add(10);
		integer.add(12);
		integer.add(11);
		Set<Integer> setValue = new LinkedHashSet<Integer>();
		for (Integer duplicate : integer) {
			if(setValue.add(duplicate)==false)
			{
				System.out.println("The duplicate value is "+duplicate);
			}
			
		}
	}

}
