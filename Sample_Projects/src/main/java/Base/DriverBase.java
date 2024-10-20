package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverBase {
	
	private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();
	
	public void setDriver(String browser) {
		switch(browser) {
		// dont need headless mode right now
		case "chrome" :
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			driver.set(new ChromeDriver(options));
			break;
		case "edge" :
			driver.set(new EdgeDriver());
			break;
		case "firefox" :
			driver.set(new FirefoxDriver());
			break;
		case "ie" :
			driver.set(new InternetExplorerDriver());
			break;
		default : 
			ChromeOptions options1 = new ChromeOptions();
			options1.addArguments("--incognito");
			options1.addArguments("--start-maximized");
			options1.addArguments("--disable-notifications");
			driver.set(new ChromeDriver(options1));
			break;
		}
		
	}
	
	public RemoteWebDriver getDriver() {
		return driver.get();
	}
	
	public void setWait() {
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
	}
	
	public WebDriverWait getWait() {
		return wait.get();
	}
}
