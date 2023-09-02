package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Execution started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test succefully completed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test case is failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test case skipped");
	}
}
