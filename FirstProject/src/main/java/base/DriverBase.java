package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class DriverBase extends AbstractTestNGCucumberTests{

	private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		ChromeOptions options = new ChromeOptions();
		/*
		 * options.addArguments("--headless"); options.addArguments("--disable-gpu");
		 */
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		driver.set(new ChromeDriver(options));
	}
	public RemoteWebDriver getDriver() {
		return driver.get();
	}

}
