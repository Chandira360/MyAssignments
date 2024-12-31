package week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiate array
		String Company[]= {"HCL","Wipro","Aspire Systems","CTS"};
		//copy it to list
		List<String>com=new ArrayList<>(Arrays.asList(Company));
		
		System.out.println("The List of Companies are:");
		for(int i=0;i<com.size();i++) {
			System.out.println(com.get(i));
		}
		System.out.println("-----------------------------------------");
		System.out.println("The Sorted Order is");
		//sort the list
		Collections.sort(com);
		for(int i=0;i<com.size();i++) {
			System.out.println(com.get(i));
		}
		//display in desending order
		System.out.println("----------------------------------------------");
		System.out.println("The Desending order is");
		for(int i=com.size()-1;i>=0;i--) {
			System.out.println(com.get(i));
		}
	}

}
