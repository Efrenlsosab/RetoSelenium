package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddWhislit {
    private WebDriver driver;
   // private By id = By.id("#list");
    private final By buttonWishlist = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[3]/div[1]/a");

    public AddWhislit(WebDriver driver) {
        this.driver = driver;
    }

     public void clickAddWishlist() {
        driver.findElement(buttonWishlist).click();
    }

    public String getText() {
        return driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div/div/p")).getText();
    }


}
