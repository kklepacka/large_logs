package projet_selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;


public class VeryLargeLogsTest extends AbstractTest {
	@Before
	public void setUp(){
		System.setProperty("log4j.configurationFile","log4j2.xml");
	}
	private static final Logger logger = LoggerFactory.getLogger(VeryLargeLogsTest.class);
	@Test
	public void largeLogsTest_OK() {
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 1000000; i++){
			logger.debug("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","a");
	}

	@Test
	public void largeLogsTest_KO(){
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 1000000; i++){
			logger.debug("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","b");
	}
}
