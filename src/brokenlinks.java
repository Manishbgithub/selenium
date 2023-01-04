
public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package maven;

		import selenium.ChromeDriver;
import selenium.HttpsURLConnection;
import selenium.IOException;
import selenium.MalformedURLException;
import selenium.URL;
import selenium.WebDriver;

		public class brokenlinks {

			public static void main(String[] args) throws MalformedURLException, IOException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");  // C:\Users\Manish\Downloads\chromedriver_win32
				 WebDriver driver = new ChromeDriver();
				 
				 //broken url
				 // step 1 is to get all the links using selenium
				 //if ststus code >400 the the url is not working  link which is tied to link
				 //java methods will call the url's and get the status code
				 //'a[href*="soupUl"]'
				 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				String url = driver.findElement(By.cssSelector("a[href*='soupUl']")).getAttribute("href");
				
				
			HttpsURLConnection conn=(HttpsURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println("respcode");
				 
				 
				 
				 
			}

		}
	}

}

	}

}
