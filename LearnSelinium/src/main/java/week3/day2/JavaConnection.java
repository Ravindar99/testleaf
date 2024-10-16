package week3.day2;

public class JavaConnection implements DatabaseConnection {

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
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
	}

}
