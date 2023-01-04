
public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package maven;    //check box

		import org.openqa.selenium.By;
		import org.openqa.selenium.SearchContext;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class checkbox {

			public static void main(String[] args) {
				
				// TODO Auto-generated method stub
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");  // C:\Users\Manish\Downloads\chromedriver_win32
					 WebDriver driver1 = new ChromeDriver();
					 driver1.get("https:/rahulshettyacademy.com/dropdownsPractise");
				 driver1.findElement(By.cssSelector("input[id*='IndArm']")).click());

				 //count the number of checkbox
				 
				 
			/*	 System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
				 driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
				System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

				 //count the number of checkbox
				System.out.println(driver.findElements(By.cssSelector("input[id*='IndArm']")).size());
				
			}      
		}
	}

}

	}

}
