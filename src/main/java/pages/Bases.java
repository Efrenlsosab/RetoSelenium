package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bases {

    private WebDriver driver;

    public Bases(WebDriver driver) {
        this.driver = driver;
    }

    public AddCar clickCategoryWomenAddCar(){
        clickXpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
        return new AddCar(driver);
    }
    public AddWhislit clickCategoryWomenAddWishlist(){
        clickXpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
        clickId("list");
        return new AddWhislit(driver);
    }
 
    public void clickXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clickId(String id) {
        driver.findElement(By.id(id)).click();
    }
}
