package Day5.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting two text
		String text1="stops";
		String text2="potss";
		//comparing the lengths of texts
		if(text1.length()==text2.length()) {
			//converting the string to character Array
			char tex1Arr[]=text1.toCharArray();
			char tex2Arr[]=text2.toCharArray();
			//sorting the Array 
			Arrays.sort(tex1Arr);
			Arrays.sort(tex2Arr);
			//comparring the elements of Array
			boolean res = Arrays.equals(tex1Arr,tex2Arr);
			if(res) {
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("It is not an Anagram");
			}
			
			}
		
		else {
			System.out.println("Lenth Mismatch,The string is not an Anagram");
		}

	}

}
