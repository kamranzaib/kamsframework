package Searching;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searching.SearchPage;

import java.io.IOException;

public class TestSearch extends CommonAPI {

    @Test
    public void globalSearch()throws IOException, InterruptedException{
       // ApplicationLog.epicLogger("Search");
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.getDataFromExcelFileAndSearch();
    }
}
