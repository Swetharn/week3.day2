package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(30);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(30);
		driver.navigate().refresh();
		String size = driver.findElement(By.className("length")).getText();
		System.out.println(size);
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@Class='brand']"));
		for (WebElement webElement : findElements2) {
			System.out.println("The List of Brand displayed in this page::" + webElement.getText());
		}
		List<WebElement> findElements3 = driver.findElements(By.xpath("//div[@Class='nameCls']"));
		for (WebElement webElement1 : findElements3) {
			System.out.println("The Name of the Bags displayed in this page::" + webElement1.getText());
		}
		driver.quit();

	}

}
