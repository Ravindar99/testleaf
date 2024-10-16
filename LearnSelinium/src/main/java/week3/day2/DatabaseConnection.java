package week3.day2;

public interface DatabaseConnection {
public void connect();
public abstract void disconnect();
public abstract void executeUpdate();
}
