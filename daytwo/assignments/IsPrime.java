package daytwo.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=8;
		int i,count=0;
		for(i=2;i<number;i++) {
			if(number%i==0) {
				count=count+1;
			}
			
			
		}
		if(count==0)
		{
			System.out.println("It is a Prime number");
		}
		else
		{
			System.out.println("It is not a Prime number");
		}
	}

}
