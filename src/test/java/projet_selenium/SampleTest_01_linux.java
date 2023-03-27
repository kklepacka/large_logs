package projet_selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class SampleTest_01_linux {
	@Test
	public void forTest() {
		List<Integer> integerList = new ArrayList<>();
		for(int i = 0; i<1000; i++){
			integerList.add(i);
		}
		Assert.assertEquals(integerList.size(),1000);
	}
}
