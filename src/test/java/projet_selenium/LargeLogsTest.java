package projet_selenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class LargeLogsTest extends AbstractTest {
	@Before
	public void setUp(){
		System.setProperty("log4j.configurationFile","log4j2.xml");
	}
	private static final Logger logger = LoggerFactory.getLogger(LargeLogsTest.class);
	@Test
	public void largeLogsTest_OK() {
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 100000; i++){
			logger.debug("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","a");
	}

	@Test
	public void largeLogsTest_KO(){
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 100000; i++){
			logger.debug("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","b");
	}
}
