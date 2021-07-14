package base;

//import com.google.common.io.File;
import com.google.common.io.Files;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.ITestAnnotation;
import pages.Bases;


import java.io.File;
import java.io.IOException;

import static com.google.common.io.Files.move;
import static java.io.File.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    private WebDriver driver;
    protected Bases bases;
    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\leoso\\Documents\\Training sofka\\Training calidad\\Automatizacion de pruebas\\selenium\\webdriver_java\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        bases = new Bases(driver);

    }
/*
@AfterMethod
public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE != result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("C:\\Users\\leoso\\Documents\\Training sofka\\Training calidad\\Automatizacion de pruebas\\selenium\\webdriver_java\\src\\test\\resources\\screenshots"+ result.getName() + ".png"));

            }catch (IOException e) {
                e.printStackTrace();
            }
        }

}*/

    @AfterAll
    public void quit(){
        driver.quit();
    }


}
