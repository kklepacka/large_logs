package projet_selenium;

import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToolBox {
	
	public static void selectCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public static String returnRandomSearchQuery(){
		List<String> queries = Arrays.asList(
				"best sushi restaurants near me",
				"how to tie a tie",
				"top 10 movies of all time",
				"best yoga studios in NYC",
				"healthy breakfast ideas",
				"weather forecast for tomorrow",
				"how to improve memory retention",
				"best budget travel destinations",
				"latest fashion trends",
				"how to start a blog"
		);
		Collections.shuffle(queries);
		return queries.get(0);
	}
}
