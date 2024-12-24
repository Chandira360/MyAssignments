package Day5.Assignments;

public class changeme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assigning the text to string
		String test="changeme";
		//converting the string to character Array
		char testt[]=test.toCharArray();
		//Initializing the for loop and converting the odd positions to Upper Case
		for(int i=0;i<test.length();i++){
			//checking for odd position
			if(i%2==1) {
				//converting to upper case
				testt[i]=Character.toUpperCase(testt[i]);
			}
		}
			testt.toString();
			System.out.println(testt);
		

}
		
		

	}


