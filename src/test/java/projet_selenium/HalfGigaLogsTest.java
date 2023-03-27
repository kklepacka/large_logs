package projet_selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;


public class HalfGigaLogsTest extends AbstractTest {
	@Before
	public void setUp(){
		System.setProperty("log4j.configurationFile","log4j2.xml");
	}
	private static final Logger logger = LoggerFactory.getLogger(HalfGigaLogsTest.class);
	@Test
	public void largeLogsTest_OK() {
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 2500000; i++){
			logger.info("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","a");
	}

	@Test
	public void largeLogsTest_KO(){
		logger.info("Generating JUnit logs...");
		Random random = new Random();
		for(int i = 0; i <= 2500000; i++){
			logger.info("Generating random numbers just for fun:"+random.nextInt(1000)+random.nextInt(1000000));
		}
		logger.info("Fun is over.");
		Assert.assertEquals("a","b");
	}
}
