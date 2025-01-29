package TestNgBase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryEngine implements IRetryAnalyzer{
	
	private int retrycount = 0;
	private static int maxretry = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if (retrycount <= maxretry) {
				retrycount++;
				System.out.println("Retrying test: " + result.getName() + " - Attempt " + retrycount);
				return true;
			}
		}
		else {
			 System.out.println("The test"+ result.getName() +"is succeeded on attempt "+ retrycount);
		}
		return false;
	}

}
