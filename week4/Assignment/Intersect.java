package week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialise 2 arrays
		Integer array1[]= {3,2,11,4,6,7};
		Integer array2[]= {1,2,8,4,9,7};
		//copy 2 arrays into 2 list
		List<Integer>list1=new ArrayList<>(Arrays.asList(array1));
		List<Integer>list2=new ArrayList<>(Arrays.asList(array2));
		//find the common elements in both list
		System.out.println("The element in both list");
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println(list1.get(i));
				}
			}
		}

	}

}
