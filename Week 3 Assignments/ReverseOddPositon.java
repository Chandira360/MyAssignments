package Day5.Assignments;

public class ReverseOddPositon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		//split the string into array
		String rev[]=test.split(" ");
		System.out.println(rev.length);
		//initialising for loop for reversing the string
		for(int i=0;i<rev.length;i++){
			//get odd position
			if(i%2==1) {
				//converting it to Array
				char reverse[]=rev[i].toCharArray();
				String text="";
				//reversing the String
				for(int j=0;j<reverse.length;j++)
				{
					text=reverse[j]+text;
				}
				//displaying the reverse string
				System.out.print(text+" ");
			}
			//Print the even position string
			else
			{
				System.out.print(rev[i]+" ");
			}
				
			}
		
		
		}
	}


