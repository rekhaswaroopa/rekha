package JPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A1 {


    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        reverseArray(a);

    }

    public static void reverseArray(int[] a)
    {
        int index=3;
        for (int i=0; i<=index; i++)
        {
            for (int j=index-1; j>=0; j--)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }




    public void logIn(String userName,String passWord)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement userNameOrPhoneNumber=driver.findElement(By.xpath("//input[@id='ap_email']"));
        userNameOrPhoneNumber.sendKeys(userName);
        WebElement pWord=driver.findElement(By.xpath("//input[@id='ap_password']"));
        pWord.sendKeys(passWord);
        WebElement logInButton=driver.findElement(By.xpath("//input[@id='ap_password']"));
        logInButton.click();
    }


    @Test
    public void mobiles(String brandName)
    {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");


        WebElement electronicsButton=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']"));
        electronicsButton.click();

        WebElement laptopsButton=driver.findElement(By.xpath("//li[@id=\"sobe_d_b_6_1\"]//img[@alt='Laptops']"));
        laptopsButton.click();

        WebElement firstElement=driver.findElement(By.xpath("//div[@class='bxc-grid__column  bxc-grid__column--3-of-12   bxc-grid__column--light']"));
        firstElement.click();

        WebElement brandNameIcon=driver.findElement(By.xpath("//li[@id='sobe_d_b_6_1']/../..//img[@alt='Dell']"));
        brandNameIcon.click();

        String winId=driver.getWindowHandle().toString();

        WebElement laptopModel=driver.findElement(By.xpath("//span[contains(text(),'Dell 14 Laptop, 12th Gen Intel Core i3-1215U Processor/8GB/512GB SSD/Intel')]"));
        laptopModel.click();

        WebElement buyNowButton=driver.findElement(By.xpath("//span[@id='submit.buy-now']"));
        buyNowButton.click();





    }


}
