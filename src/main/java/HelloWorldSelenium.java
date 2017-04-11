
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
	public static  WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Inicializando o selenium web driver");
		//Pega o usuário da máquina
		String user = System.getenv("username");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\"+ user +"\\Documents\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.get("https://www.google.com/");
		try{  
		    Thread.sleep(2000);  
		}catch(Exception e){}  

		//driver.close();  
		//driver.quit();  
	}
}