
package goibiboTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium-Java\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String Month = "December";
		int Year = 2022;
		String found;
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("departureCalendar")).click();
		Thread.sleep(2000);
		/*
		 found = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		 String arr[]= found.split(" ");
		 while(true) {
		 if(Integer.valueOf(arr[1]) < Year) {
			 driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[1]")).click();
			 found = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();	 
			 }
		 else if(Integer.valueOf(arr[1]) == Year) {
			 if(arr[0] == Month) {
				 
			 }
			 break;
		 }
		 else {
			 driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
		 }
		
		 }
	*/
		int value = 30;
		driver.findElement(By.xpath("//div[contains(@id, '"+value+"')]")).click();
	}

}
