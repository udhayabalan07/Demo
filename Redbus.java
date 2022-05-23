package selineum1;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

public static void main(String[] args)throws IOException, InterruptedException{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\selineum1\\ch\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();

WebElement from = driver.findElement(By.xpath("//*[@id=\"src\"]"));
from.sendKeys("Bangalore");
from.click();
WebElement to = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
to.sendKeys("Mumbai");
to.click();

Thread.sleep(800);

driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();

driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();

Thread.sleep(800);
driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();

Thread.sleep(800);
driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[4]/label[1]")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]")).click();

}
}
