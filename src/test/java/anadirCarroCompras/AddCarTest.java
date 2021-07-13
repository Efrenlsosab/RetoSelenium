package anadirCarroCompras;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import pages.AddCar;


public class AddCarTest extends BaseTest {

    @Test
    public void category() throws InterruptedException {
        AddCar addcar = bases.clickCategoryWomenAddCar();
        addcar.addProduct();
        Thread.sleep(4000);
        //System.out.println(addcar.getText());
        assertEquals(addcar.getText(), "Product successfully added to your shopping cart", "it wasn't add to car");
    }


}
