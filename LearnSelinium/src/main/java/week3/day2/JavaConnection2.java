package week3.day2;

public class JavaConnection2 extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("update executed successfully");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Query executed successfully");
		
	}
	public static void main(String[] args) {
		JavaConnection2 jb=new JavaConnection2();
		jb.connect();
		jb.disconnect();
		jb.executeUpdate();
		jb.executeQuery();
	}


}
