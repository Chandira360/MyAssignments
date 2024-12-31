package week4.assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get a name in text
		String text="chandira";
		//convert it to array
		char texarr[]=text.toCharArray();
		//initialize a set
		Set<Character>unique=new HashSet<>();
		//iterate the array values
		for(int i=0;i<texarr.length;i++) {
			//get the value to compare
			char a=texarr[i];
			
			//check the value present in set
			if(unique.contains(a)) {
				//if it it present delete the value
				unique.remove(a);
				
			}
			//if not add the value
			else {	
			unique.add(a);
			
			}
				}
					
			System.out.println(unique);
		
		


	}

}
