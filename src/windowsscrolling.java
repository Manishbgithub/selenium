
public class windowsscrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package maven;

		import selenium.ChromeDriver;
import selenium.JavascriptExecutor;
import selenium.List;
import selenium.WebDriver;
import selenium.WebElement;

		public class windowsscrolling {

			private static final String document = null;

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");  // C:\Users\Manish\Downloads\chromedriver_win32
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				 JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		 List<WebElement>values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		 for(int i = 0;i<values.size();i++)
		 {
			 sum=sum+Integer.parseInt(values.get(i).getText());
		 }
		 System.out.println(sum);
		 driver.findElement(By.cssSelector(".totalamount")).getText();
			}

		}
	}

}

	}

}
