package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ReadProperties;

public class baiduSerch {

	public static void baiduSerch(WebDriver dr,String s1) {
		dr.findElement(By.id("kw")).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		dr.findElement(By.id(ReadProperties.getprop("elements", "element", "baiducontent1"))).clear();
		//		dr.findElement(By.id(ReadProperties.getprop("elements", "element", "baiducontent1"))).sendKeys(s1);
		//		dr.findElement(By.id(ReadProperties.getprop("elements", "element", "baiduserch1"))).click();

		dr.findElement(By.xpath(ReadProperties.getprop("elements", "element", "baiducontent"))).clear();
		dr.findElement(By.xpath(ReadProperties.getprop("elements", "element", "baiducontent"))).sendKeys(s1);
		dr.findElement(By.xpath(ReadProperties.getprop("elements", "element", "baidusearch"))).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
