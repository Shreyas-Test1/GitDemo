
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","C://chromedriver-win64//chromedriver-win64/chromedriver.exe");
		
		
		 
		   String downloadPath=System.getProperty("user.dir");

		   HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		   chromePrefs.put("profile.default_content_settings.popups", 0);

		   chromePrefs.put("download.default_directory", downloadPath);

		   ChromeOptions options=new ChromeOptions();
			options.setBinary("C://chrome-win64/chrome.exe");

		   options.setExperimentalOption("prefs", chromePrefs);

		   WebDriver driver=new ChromeDriver(options);

		   driver.get("https://altoconvertpdftojpg.com/");

		   driver.findElement(By.id("browse")).click();

		   Thread.sleep(3000);

	//	   Runtime.getRuntime().exec("C:\\Users\\rahul\\Documents\\check\\fileupload.exe");
		    
			 Robot rb = new Robot();

			    // copying File path to Clipboard

			    StringSelection str = new StringSelection("C:\\Users\\HP\\Desktop\\SELENIUM COURSE  -UDEMY FILES\\AutoIT\\upload.xlsx");

			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			     // press Contol+V for pasting
			     rb.keyPress(KeyEvent.VK_CONTROL);

		     rb.keyPress(KeyEvent.VK_V);
			    // release Contol+V for pasting

			    rb.keyRelease(KeyEvent.VK_CONTROL);

			    rb.keyRelease(KeyEvent.VK_V);
			    // for pressing and releasing Enter

			    rb.keyPress(KeyEvent.VK_ENTER);

			    rb.keyRelease(KeyEvent.VK_ENTER);

		  // WebDriverWait wait= new WebDriverWait(driver,10);
			    Thread.sleep(3000);
		//   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

		   driver.findElement(By.id("submit_btn")).click();

		//   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		   Thread.sleep(8000);
		   driver.findElement(By.linkText(" Download ")).click();

		   Thread.sleep(5000);

		   File f=new File(downloadPath+"/converted.zip");

		   if(f.exists())

		   {
           System.out.println("File exist");
		  // Assert.assertTrue(f.exists());

		   if(f.delete())

		   System.out.println("file deleted");

		   }

		   }

		   }


		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		 
			
