package mavAutomationLab;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    @Test
	public void testApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10649926\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		/*
		 * String
		 * el=driver.findElement(By.xpath("//td[normalize-space()='Roland Mendel']")).
		 * getText(); String loc=
		 * driver.findElement(By.xpath("//td[normalize-space()='Austria']")).getText();
		 * 
		 * System.out.println(loc);
		 */
        List<WebElement> contact = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td[2]"));
        List<String> listcontact =contact.stream().map((s-> s.getText())).collect(Collectors.toList());
        System.out.println(listcontact);
        List<WebElement> place=contact.stream().filter(s ->s.getText().contains("Yoshi")).map(m->m.findElement(By.xpath("following-sibling::td"))).collect(Collectors.toList());
        List<String> h =place.stream().map((s-> s.getText())).collect(Collectors.toList());
        System.out.println(h);

}
	/*
	 * @Test private static String getCity(WebElement m) { //System.out.println(s);
	 * String city=m.findElement(By.xpath("following-sibling::td")).getText(); //
	 * TODO Auto-generated method stub
	 * //System.out.println(city);//*[@id="post-76995"]/table[2]/thead/tr/th[1]
	 * System.out.println(city); return city; }
	 */
    
        }
																																																																																																																																																																																																																																																																																																																													

