package Searching;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searching.SearchPage;

import java.io.IOException;

public class TestSearch extends CommonAPI {

    @Test
    public void testingSearch() throws IOException, InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        SearchPage.searchForItems();
        SearchPage.getDataFromExcelFileAndSearch();

    }

}
