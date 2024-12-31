package week4.assignment;

public class DBConnect implements DataBaseConnection {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("The Database is Connected");
	}

	@Override
	public void disConnect() {
		// TODO Auto-generated method stub
		System.out.println("The Database is Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("The Executed query is updated Sucessfully");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnect db=new DBConnect();
		//calling interface methods through class
		db.connect();
		db.disConnect();
		db.executeUpdate();
		

	}

}
