package projet_selenium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest_07_linux {
	@Test
	public void forTest() {
		List<Integer> integerList = new ArrayList<Integer>();
		for(int i = 0; i<20000000; i++){
			integerList.add(i);
		}
		Assert.assertEquals(integerList.size(),20000000);
	}
}
