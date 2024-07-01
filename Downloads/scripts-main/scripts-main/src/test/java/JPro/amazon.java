package JPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class amazon{

    String product="electronics";
    String device="Laptop";
    String brandName="Dell";
    String model="Dell 14 Laptop, 13th Gen Intel Core i3-1305U Processor/ 8GB/ 512GB SSD/14.0";

    @Test
    public void mobiles()
    {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement electronicsButton=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_"+product+"']"));
        electronicsButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement deviceName=driver.findElement(By.xpath("//div[@id='sobe_d_b_6-carousel-viewport']/descendant::img[@alt='"+device+"']"));
        deviceName.click();

        String xpath = "//a[@aria-label='%s']//following::img[@alt='%s']";
        String xpath1 = String.format(xpath, brandName, brandName);

        WebElement brandNameButton=driver.findElement(By.xpath(xpath1));
        brandNameButton.click();

        String parentWinId=driver.getWindowHandle();

        WebElement laptopModel=driver.findElement(By.xpath("//span[contains(text(),'"+model+"')]"));
        laptopModel.click();

        Set<String> childWinId = driver.getWindowHandles();

        for (String wId: childWinId)
        {
            String title =driver.switchTo().window(wId).getTitle();

            if (title.contains("Dell 14 Laptop, 13th Gen Intel"))
            {
                break;
            }
        }

        WebElement buyNowButton=driver.findElement(By.xpath("//span[@id='submit.buy-now']"));
        buyNowButton.click();
    }

}
