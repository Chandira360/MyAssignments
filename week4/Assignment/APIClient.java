package week4.assignment;

public class APIClient {
	public void sentRequest(String endPoint) {
		System.out.println("The end point of the Request is "+endPoint);
	}
public void sentRequest(String endPoint,String requestBody,boolean requestStatus) {
		System.out.println("The end Point of the Request "+endPoint);
		System.out.println("The Request body is "+requestBody);
		System.out.println("The Request status is"+requestStatus);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient aclient=new APIClient();
		//calling the method with single Arguments
		aclient.sentRequest("HTTP Server");
		//calling the method with 3 arguments
		aclient.sentRequest("HTTP Server","Google",true);

	}

}
