package cases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import tasks.baiduSerch;
import util.Browser;


public class BrowserTest {
	private Logger logger = Logger.getLogger(Test.class);
	WebDriver dr;
	
	//以下是固定寫法
	@DataProvider(name="muke")
	public Object[][] getData() throws IOException{
		String filepath="D:\\javastart\\testlink.xlsx";
		Object[][] array= util.RangeDatabyPOI.poiRangeData(filepath);
		return array;
	}
	
	@Test(dataProvider ="muke")
	public void browser(String s1,String s2) throws InterruptedException{
		baiduSerch.baiduSerch(dr, s1);
		baiduSerch.baiduSerch(dr, s2);
	}
	
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void beforetest(String browser,String url){
		logger.info("browser is : "+browser+"&url is :"+url);
		dr=Browser.openBrowser(dr, browser, url);
	}
	
	@AfterTest
	public void quit(){
		Browser.closeBrowser(dr);
	}
	
	
}
