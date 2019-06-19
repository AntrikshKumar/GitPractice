import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antri\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//driver.navigate("http://www.google.com");
		System.out.println("Hello");
		System.out.println("Hello1");
		System.out.println("Hello3");
		
		System.out.println("Hello4");
		System.out.println("Hello5");
		System.out.println("Hello6");
		
		System.out.println("Demo10");
		System.out.println("Demo11");

		System.out.println("Demo20");
		System.out.println("Demo21");

	}

}
