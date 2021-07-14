package addWhislist;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.AddWhislit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddWhislistTest extends BaseTest {

    @Test
    public void addWishList() throws InterruptedException {
        AddWhislit addWishlist = bases.clickCategoryWomenAddWishlist();
        addWishlist.clickAddWishlist();
        Thread.sleep(4000);
        assertEquals(addWishlist.getText(),"You must be logged in to manage your wishlist.","The product was add to wishlist");

    }

}
