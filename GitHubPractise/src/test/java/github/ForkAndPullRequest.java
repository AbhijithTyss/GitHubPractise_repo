package github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ForkAndPullRequest {
	@Test
	public void sample() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Empty browser launched",true);
	}
}
