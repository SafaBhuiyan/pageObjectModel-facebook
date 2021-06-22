package com.facebook.fullScreenShotDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class AshotImages {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		takeAshotImage(driver, "TEP-AshotImage");

	}
	
	public static void takeAshotImage(WebDriver driver, String ashot) {
		Screenshot screen= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(300)).takeScreenshot(driver);
//		String path = System.getProperty("user.dir") + "/Screenshot/" + ashot + System.currentTimeMillis()
//		+ ".png";
		
		String path = "D:\\TEP Solution and Cons\\TEP_GIT_Projects\\pageObjectModel-facebook\\com.facebook\\FullScreenAshot\\"+ashot+System.currentTimeMillis()+".jpg";
		try {
			ImageIO.write(screen.getImage(), "JPG", new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
