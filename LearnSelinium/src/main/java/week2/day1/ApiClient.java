package week2.day1;

public class ApiClient {
public void sendRequest(String endpoint) {
	System.out.println(endpoint);
}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println(endpoint + requestBody + requestStatus);
}
public static void main(String[] args) {
	ApiClient apc=new ApiClient();
	apc.sendRequest("hi");
	apc.sendRequest("hello ", "there ", false);
}

}
