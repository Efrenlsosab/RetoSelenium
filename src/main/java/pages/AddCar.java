package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCar {
    private WebDriver driver;
    private By xpathButton = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");

    public AddCar(WebDriver driver) {
        this.driver = driver;
    }

    public void addProduct() {
        driver.findElement(xpathButton).click();
    }

    public String getText() {
        return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText();
    }
}
