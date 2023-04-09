import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserOrangeHrmLive {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

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
