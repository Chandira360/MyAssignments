package week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialise the array
		Integer arr2[]= {3,2,11,4,6,7};
		//copy it to list
		List<Integer>sec=new ArrayList<>(Arrays.asList(arr2));
		//sort the list
		Collections.sort(sec);
		System.out.println("The elements in the sorted order is"+sec);
		//get the size of the list
		int size=sec.size();
		//display the second largest
		System.out.println("The second largest element in the list is "+sec.get(size-2));
	}

}
