package robo3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo extends Elementos {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fagwe\\OneDrive\\Área de Trabalho\\Wesley\\Drivers Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://yagoberry.ru/bonus");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(clicar).click();
		driver.findElement(clicar1).click();
		driver.findElement(clicar1).sendKeys("P1080278541");
		driver.findElement(clicar1).submit();
		driver.findElement(ganhar).click();

		driver.findElement(obterdinheiro).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

		driver.findElement(obterdinheiro).click();
		driver.findElement(obterdinheiro2).click();
		Thread.sleep(310000);

	}

}
