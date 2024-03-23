package Pages;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	SplashPage splashPage = new SplashPage();

	@Before
	public void setUp() {
		BaseClass.getDriver();
	}
	
	@After
	public void tearDown() {
		BaseClass.tearDown();
	}
}
