package week4.assign;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		//empty set

		Set<String> txtSet = new LinkedHashSet<String>();

		for(int i= 0;i<=split.length-1;i++)
		{
		System.out.println(split[i]);
		txtSet.add(split[i]);
		}
		System.out.println(txtSet);	
		}
	}


