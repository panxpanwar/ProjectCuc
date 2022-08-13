package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class CaptureScreen {
	
	String scrnPath = "C:\\projectScreenshots\\homePageScreenshot.png";
	public void myScreen(WebDriver driver, String scrnPath) {

		TakesScreenshot scrnCap = (TakesScreenshot)driver;

		try {
			FileUtils.copyFile(scrnCap.getScreenshotAs(OutputType.FILE), new File(scrnPath));
		} catch (IOException e) {}

	}

}
