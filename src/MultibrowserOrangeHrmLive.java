import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultibrowserOrangeHrmLive {
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser");
        }

        driver.manage().window().maximize();// maximize the browser
        // Open the url into browser
        driver.get(baseUrl);
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        System.out.println("Current Url :- " + driver.getCurrentUrl());

        // get page source
        System.out.println(driver.getPageSource());

        driver.findElement(By.xpath("//*[@name='username']")).click();

        //find the email element
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");

        // find the password element

        // driver.findElement(By.xpath("//*[@name='password']")).click();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");

        // close the driver
        driver.close();

    }
}
