package page;

import base.CommonAPI;

public class AmazonSearch extends CommonAPI {

    public void searchItems(){
        System.out.println(driver.getTitle());
        typeByCss("#twotabsearchtextbox", "Java Books");
        clickByCss(".nav-input");
        clearField();
        System.out.println(driver.getCurrentUrl());

    }
    }


