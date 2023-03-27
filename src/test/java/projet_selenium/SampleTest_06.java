package projet_selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SampleTest_06 extends AbstractTest {
	@Before
	public void setup() {
		selectBrowser(browser);
	}
	@After
	public void teardown() {
		driver.quit();
	}
	@Test
	public void qwantSearchTest() {
		String query = ToolBox.returnRandomSearchQuery();
		driver.get("https://qwant.com");
    	driver.findElement(By.name("q")).sendKeys(query, Keys.RETURN);
    	Assert.assertTrue(driver.findElement(By.name("q")).getAttribute("value").equals(query));
	}
}
