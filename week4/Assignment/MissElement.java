package week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialise the array
		Integer arr1[]= {1,2,3,4,10,6,8};
		//copy it to the list
		List<Integer>missli=new ArrayList<>(Arrays.asList(arr1));
		//sort the list
		Collections.sort(missli);
		System.out.println("The elements in the sorted list"+missli);
		//after sorting the first element will be right so display it
		System.out.println("The element is correct:"+missli.get(0));
		//compare the element with its previous element as it is contiguous
		for(int i=1;i<missli.size();i++) {
			//System.out.println(missli.get(i));
			//intiate an element x for comparing with previous number
			int x=missli.get(i)-1;
			//System.out.println(x);
			//compare the element
			if(x==missli.get(i-1)) {
				System.out.println("The element is correct:"+missli.get(i));
			}
			//print the missed element
			else {
				System.out.println(x+" element is a missing");
			}
		}
		
		
		
		

	}

}
