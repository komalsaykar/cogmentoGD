package BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public void properties() throws IOException
	{
		
		prop=new Properties();
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\login.properties";
		FileInputStream fs=new FileInputStream(path);
		prop.load(fs);
		
	}
	
public static void intilization()
{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
