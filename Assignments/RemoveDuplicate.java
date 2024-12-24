package Day5.Assignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialising a string
		String text = "We learn java basics as part of java sessions in java week1";
		//assigning count to 0
		int count=0;
		//spliting the string and storing it in Array
		String split[]=text.split(" ");
		//comparing the Array for duplicate value
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
				//	System.out.println(split[j]);
					//assigning the duplicate entry as "space"
					split[j]=" ";
					count=count+1;
				}
			}
		}
	//System.out.println(count);
	if(count>1) {
		System.out.println("The string has Duplicate entry");
	//displaying the result
	for(int i=0;i<split.length;i++) {
	System.out.print(split[i]+" ");
	}
	}
	}
}
