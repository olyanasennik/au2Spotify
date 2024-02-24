import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Spotify {
    public static void main (String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://open.spotify.com/");
    driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();


    driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("kovan13@gmail.com", Keys.TAB, "Olganik.17", Keys.ENTER);
        WebElement icon = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/button[2]/span"));
        Assert.assertTrue(icon.isDisplayed());

driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/nav/div[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[3]/div/div/form/input")).sendKeys("Adele Hello");
driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div/div/section[1]/div[2]/div/div/div/div[4]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/main/section/div[3]/div[4]/div/div/div/div/div/button/span")).click();
WebElement playingNow = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/footer/div/div[1]/div"));
Assert.assertTrue(playingNow.getText().contains("Hello"));
Assert.assertTrue(playingNow.getText().contains("Adele"));
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/button[2]/span")).click();
driver.findElement(By.xpath("//button[@data-testid = 'user-widget-dropdown-logout']")).click();

WebElement loginButton = driver.findElement(By.xpath("//span[@class = 'ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set']"));
Assert.assertTrue(loginButton.isDisplayed());



    }

}
