package anthony_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TotalWineTask {
    public static WebDriver driver;

    public static void main(String[] args) {
        searchValidation();
    }

    public static void searchValidation() {
//        setUpTest();
        driver.findElement(By.id("at_searchProducts")).sendKeys("beer" + Keys.ENTER);
        String searchResult = driver.findElement(By.xpath("//h1[contains(@class,'resultTitle')]")).getText();
        
        if (searchResult.contains("beer")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.findElement(By.xpath("//*[contains(@class,'linkButton') and text() ='Beer]")).click();
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
        	wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'Checkbox')/*[text()='Ale(1,891)']")));
        System.out.println("found the item");
        	
        
        // Close the WebDriver when done
    }catch(Exception e) {
    	System.out.println("did not find");
    }finally {
      endTest();
    }

    }
//    public static void setUpTest() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.manage().window().maximize();
//        driver.get("https://www.totalwine.com/");
//    }
    public static void endTest() {
    	driver.close();
    	driver.quit();
    }
}
