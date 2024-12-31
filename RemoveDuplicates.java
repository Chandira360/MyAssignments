package week4.assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a string
String text="PayPal India";
//convert it to char
char convert[]=text.toCharArray();
//declare tow set
Set<Character>charSet=new HashSet<>();
Set<Character>dupCharSet=new HashSet<>();
//iterate the array
for (int i=0;i<convert.length;i++) {
	//get the value
	char a=convert[i];
	//check it is present in charSet list
	if(charSet.contains(a)) {
		//if present add it to dupCharSet
		dupCharSet.add(a);
	}
	//else add the element to charset
	else {
		charSet.add(a);
	}
		
	
}
//remove the values of dupCharSet present in charSet
for(char i:dupCharSet) {
	if(charSet.contains(i)) {
		charSet.remove(i);
	}
}
//remove the space in charset
charSet.remove(' ');
//print both list
System.out.println(charSet);
System.out.println(dupCharSet);
	}

}
