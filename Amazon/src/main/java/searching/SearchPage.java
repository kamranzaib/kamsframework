package searching;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchPage extends CommonAPI {


    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public static void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }

    public static void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }

    public static void searchForItems(){
        String value = "Java Books";
        searchFor(value);
        submitSearchButton();
    }
    public static void getDataFromExcelFileAndSearch()throws IOException, InterruptedException{
        //TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //Page Factory class init
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            Thread.sleep(1000);
          itemsToBeSearched.clearField();
        }
    }
}







