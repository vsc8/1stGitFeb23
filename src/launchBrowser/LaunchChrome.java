package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Scanner snc = new Scanner(System.in); //create object scanner
		//we are asking the system to take some input through there
		//class called scanner and for which we are creating object
		
		//for working with selenium web driver by the name is telling what- we need to create object
		//of WebDriver..here we have to give object name "driver" only because it is industry standard
		 //we have to define which WebDriver we are going to create/we want to launch
		//in our case we are going to use Chrome
		
		//1) Launch chrome (browser)
		WebDriver driver = new ChromeDriver();// here ther is error red line under both , if you put cursor on it 
		//WebDriver and ChromeDriver
		//then even it doesn't show import 
		//here the above WebDriver belongs to which tool-Chrome but here we are learning/using selenium tool
		//selenium should contain WebDriver and we don't have it, it's not a part of Java so this driver is not in JRE
		//so we need to get jar files like we did for excel during when were learning Java
		//we get this jar files from "selenium-java-4.9.1"//without the selenium jar files we cannot do the import for our WebDriver
		
		//please read notebook before reading below coding
		
		//when u run this program, it pops up the chrome browser,  this above line of code is launching our chrome browser
		// above that "driver" is object variable and that object variable contains all the methods 
		
		//2) Fetch Website
		driver.get("https://www.google.com/"); //this is the url we are passing as an argument in a string format for the get method
		//here when you right click and click on run as - java application, it says java application bse we are using main method
		// here when we run above program and google page will open but the page is minimize form and we want maximize page 
		
		//3) Maximize browser
		driver.manage().window().maximize();	//we are asking the driver to manage the window and maximize it
		// any action you want to perform with your mouse with your browser more or less you can do all those with selenium, selenium has some kinf=d of method to deal with it, bse still 100 percent
		//automation is not achievable
		
		//4) Type selenium, here we want to inspect search bar in google website so we will right click on search bar and go to inspect and copy the  whatever value is in name(name = q)
		driver.findElement(By.name("q")).sendKeys("selenium123");
		
		//5) Click search button, we want to inspect click button on Google search so we will right click on search bar and go to inspect and copy the  whatever value is in name(name =btnk)
		driver.findElement(By.name("btnk")).click();
		
		//6) Close browser
		driver.close();
		
		Thread.sleep(3000);	//java will close very fast this method  so we will pause the closing of browser with few seconds- it takes long as milliseconds, milliseconds is 3000 milliseconds
		//the browser will pause for 3 seconds and it will close
	
	
	
	}
	 
	
	
	
}
