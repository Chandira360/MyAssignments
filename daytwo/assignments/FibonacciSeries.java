package daytwo.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8;
		int num1=0,num2=1,num3;
		int i;
		System.out.println("The Fibonacci Series");
		System.out.println(num1+"\n"+num2);
		for(i=3;i<input;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
		
	}
}
