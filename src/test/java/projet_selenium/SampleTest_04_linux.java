package projet_selenium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest_04_linux {
	@Test
	public void forTest() {
		List<Integer> integerList = new ArrayList<>();
		for(int i = 0; i<1000000; i++){
			integerList.add(i);
		}
		Assert.assertEquals(integerList.size(),1000000);
	}
}
