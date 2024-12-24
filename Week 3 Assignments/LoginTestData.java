package Day5.Assignments;

public class LoginTestData extends TestData{
public void enterUserName() {
	System.out.println("The user name is entered");
}
public void enterPassWord() {
	System.out.println("The password is entered");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Calling the methods of both super class and subclass by creating an object in sub class");
//creating object of sub class
	LoginTestData td=new LoginTestData();
	//calling the methods of both superclass and sub class
td.enterCredencials();
td.navigateToHomePage();
td.enterUserName();
td.enterPassWord();
System.out.println("---------------------------------------------------------------");
System.out.println("Calling the methods of super class by creating the object in sub class");
//creating the object of super class in sub class
TestData tdd=new TestData();
//calling the methods
tdd.enterCredencials();
tdd.navigateToHomePage();

}
}
