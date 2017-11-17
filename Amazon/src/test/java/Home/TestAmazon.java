package Home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.AmazonSearch;

public class TestAmazon extends AmazonSearch {

    @Test
    public void testHome() {
        searchItems();

    }


}
