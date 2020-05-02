package nageshwar;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

		public static void main(String[] args)
				throws InterruptedException, IOException {
					System.setProperty("webdriver.chrome.driver","E:\\Mindqbatch232\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					Thread.sleep(3000);
					//Launching site
					driver.get("http://www.jqueryui.com");
					Thread.sleep(5000);
					WebElement e=driver.findElement(By.tagName("a"));
					Actions a=new Actions(driver);
					Thread.sleep(5000);
					a.click(e).build().perform();
					/*WebElement e=driver.findElement(By.tagName("a"));
					Actions a=new Actions(driver);
					Thread.sleep(5000);
					a.doubleClick(e).build().perform();*/
					Thread.sleep(5000);
					driver.close();
					

	}

}
