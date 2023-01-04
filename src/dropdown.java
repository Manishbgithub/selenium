
public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package maven;

		import selenium.By;
import selenium.ChromeDriver;
import selenium.WebDriver;

		public class updateddropdown {
		// for adding passenger plus plus 
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");  // C:\Users\Manish\Downloads\chromedriver_win32
					 WebDriver driver = new ChromeDriver();
					 driver.get("https:/rahulshettyacademy.com/dropdownsPractise");
					// Assert.assertEquals(false, false)
					 System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
					 driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
					System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

					 //count the number of checkbox
					driver.findElements(By.cssSelector("input[id*='IndArm']")).size();
					
					
			
				driver.findElement(By.id("divpaxinfo")).click();
		             
		Thread.sleep(2000);


		        
		          
		          for (int i=1;i<5;i++)
		    
		          {          
		        	  
		        	  driver.findElement(By.id("hrefIncAdt")).click();
		        	  
		          }
		driver.findElement(By.id("btnclosepaxoption")).click();

			
			
			}

		private static Object findElements(By cssSelector) {
			// TODO Auto-generated method stub
			return null;
		}
		}
			
		// int i=1;
		/* while(i<5)
		 {
		     driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		 }*/
			   
		             
		             
			 
		  
	}

}

	}

}
