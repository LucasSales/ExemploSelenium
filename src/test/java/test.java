import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	@Test
	public void testSelenium() {
		WebDriver driver = null;
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\great\\Documents\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.get("https://www.google.com/");
		try{  
		    Thread.sleep(2000);  
		}catch(Exception e){}
	}

}
