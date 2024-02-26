package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

public static WebDriver driver;
public ResourceBundle rb;
public Logger lg;

@BeforeClass
public void setup() {
	rb= ResourceBundle.getBundle("config");
	lg= LogManager.getLogger(this.getClass());
	//if(br.equalsIgnoreCase("chrome")) {
	driver= new ChromeDriver();//}
	//else
		//if(br.equalsIgnoreCase("edge"))
	//	driver= new EdgeDriver();
	lg.info("launching url");
	driver.get(rb.getString("appURL"));
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
}

@AfterClass
public void close() {
	//driver.close();
}
}
