

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class IndexEsriMainPage {

	static WebDriver driver = null;
	//String EsriMainURL = "http://cmsqa.esri.com/index.html";
	private Assertion hardAssert = new Assertion();
	private SoftAssert softAssert = new SoftAssert();

	String actualPageTitle;
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();  // open firefox
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		String EsriMainURL = TestUtil.getProp().getProperty("EsriMainURL");
		System.out.println(EsriMainURL);
		driver.get(EsriMainURL);
		driver.manage().window().maximize();

	}
	public static String getPageTitle(String linkName) {
		driver.findElement(By.linkText(linkName)).click();
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public static String verifyPageUrl(String linkName) {
		driver.findElement(By.linkText(linkName)).click();
		String pageURL = driver.getCurrentUrl();
		return pageURL;
	}
	@Test(priority = 1)
	public void esriMainTest() throws InterruptedException, IOException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Esri - GIS Mapping Software, Solutions, Services, Map Apps, and Data"); 

			driver.findElement(By.linkText("Industries")).click();
			Thread.sleep(2000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Government");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriGov");
			driver.navigate().back();		
			driver.findElement(By.linkText("Industries")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Business");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriBusiness");
			driver.navigate().back();			
			driver.findElement(By.linkText("Industries")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Utilities & Communications");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriUti&commu");
			driver.navigate().back();			
			driver.findElement(By.linkText("Industries")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Natural Resources");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriNatRes");
			driver.navigate().back();			
			driver.findElement(By.linkText("Industries")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Additional Industries");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriAddInd");
			driver.navigate().back();			 
			driver.findElement(By.linkText("Products")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS Platform");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriArcGISPlat");
			driver.navigate().back();			 
			
			driver.findElement(By.linkText("Products")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Capabilities");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriCapabi");
			driver.navigate().back();		 
			driver.findElement(By.linkText("Support & Services")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Training");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriTraining");
			driver.navigate().back();		 
			
			driver.findElement(By.linkText("Support & Services")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Services");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriServ");
			driver.navigate().back();
			driver.findElement(By.linkText("About")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("About Esri");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriAbout");
			driver.navigate().back();			 
			driver.findElement(By.linkText("About")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("News");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriNews");
			driver.navigate().back();		
			driver.findElement(By.linkText("About")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Careers");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriCareer");
			driver.navigate().back();	
			driver.findElement(By.linkText("About")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Events");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriEvents");
			driver.navigate().back();			 
			driver.findElement(By.linkText("Community")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("GeoNet");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriGeonet");
			driver.navigate().back();
			driver.findElement(By.linkText("Community")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Industry Spaces");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriIndSpace");
			driver.navigate().back();
			driver.findElement(By.linkText("Community")).click();
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Featured Spaces");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			Thread.sleep(2000);	
			 TestUtil.takeScreenShot(driver, "EsriFeaSpaces");
			driver.navigate().back();
			
			
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Sign In");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
	//search functionality
			driver.findElement(By.id("abovemain_0_megaMenu_mast")).sendKeys("test");
			driver.findElement(By.id("abovemain_0_megaMenu_mast")).sendKeys(Keys.ENTER);
			softAssert.assertEquals(driver.getTitle(), "Search");
			driver.navigate().back();	 

			 

			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS Platform");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();	
			
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS Online");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS for Desktop");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS for Server");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS for Developers");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS Solutions");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("ArcGIS Marketplace");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Contact Us");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			
			Thread.sleep(3000);		
			actualPageTitle = IndexEsriMainPage.getPageTitle("Site Map");
			if (actualPageTitle.contains("Page not found")) {
			softAssert.assertTrue(false);			
			}
			driver.navigate().back();
			

			 softAssert.assertAll();
		
		 
	
	}		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}


	
