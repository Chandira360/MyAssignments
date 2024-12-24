package Day5.Assignments;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object of Super class Web Element
		WebElement wbe=new WebElement();
		//calling the methods of web element class
		wbe.click();
		wbe.setText("Calling from Web Element");
		System.out.println("----------------------------------------");
		//creating an object for button class
		Button but=new Button();
		//Calling the Methods of webelement
		but.click();
		but.setText("Calling from Button Class");
		//calling the methods of button
		but.submit();
		System.out.println("----------------------------------------");
		//creating object Sub Class TextField
		TextField tf=new TextField();
		//calling the methods of web element
		tf.click();
		tf.setText("Calling from TextField class ");
		//calling the methods of Textfield
		tf.getText();
		System.out.println("----------------------------------------");
		//Creating object for SubClass CheckBoxButton
		CheckBoxButton cbx=new CheckBoxButton();
		//calling methods of Web element
		cbx.click();
		cbx.setText("Calling from CheckBox Button Class");
		//calling button methods
		cbx.submit();
		//calling checkbox method
		cbx.clickCheckButton();
		System.out.println("----------------------------------------");
		//Creating object of RadioButton 
		RadioButton rb=new RadioButton();
		//calling web elemnt methods
		rb.click();
		rb.setText("Calling from Radio Button");
		//calling button method
		rb.submit();
		//calling radio button methods
		rb.selectRadioButton();
		System.out.println("----------------------------------------");
		//An object for element is created
		Elements ele=new Elements();
		//Calling the methods of Super class WebElement
		ele.click();
		ele.setText("Calling from Element");
		//Calling the methods of Sub class Button
		ele.submit();
		
		

	}

}
