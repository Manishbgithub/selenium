
public class actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package maven;

		import selenium.Actions;
import selenium.ChromeDriver;
import selenium.WebDriver;
import selenium.WebElement;

		public class actiondemoo {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");  // C:\Users\Manish\Downloads\chromedriver_win32
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.amazon.in/");
				 Actions a = new Actions(driver);
				 WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));    // add list and acount in amazon.
		        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hey").build().perform();  //moving from account and list 
				 //moves to specific element 
				 a.moveToElement(move).build().perform(); //

				 
				 
			}

		}
	}

}

	}

}
