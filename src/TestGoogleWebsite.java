import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestGoogleWebsite {

	@Test
	void testSearchByKeyword() {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("KRU");
		search_box.sendKeys(Keys.ENTER);
		
		String result = driver.findElement(By.className("VuuXrf")).getText();
		assertEquals("Kanchanaburi Rajabhat University",result);
		driver.close();
		
		
	}

	@Test
	void testSearchByKeyword2()
	{

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("NPRU");
		search_box.sendKeys(Keys.ENTER);
		
		String result = driver.findElement(By.className("VuuXrf")).getText();
		assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword3()
	{

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("SSRU");
		search_box.sendKeys(Keys.ENTER);
		
		String result = driver.findElement(By.className("VuuXrf")).getText();
		assertEquals("มหาวิทยาลัยราชภัฏสวนสุนันทา",result);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword4()
	{

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("NPRU");
		search_box.sendKeys(Keys.ENTER);
		
		String result = driver.findElement(By.className("VuuXrf")).getText();
		assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword5()
	{

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium\\\\selenium-python\\\\selenium-python-main\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("NPRU");
		search_box.sendKeys(Keys.ENTER);
		
		String result = driver.findElement(By.className("VuuXrf")).getText();
		assertEquals("มหาวิทยาลัยราชภัฏนครปฐม",result);
		driver.close();
		
		
	}
}