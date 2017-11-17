package dataTable;

import base.CommonAPI;

public class ScrapTableData extends CommonAPI{

    public void readData(){
        String rowValue = getTextByCss(".w3-responsive .w3-table-all.notranslate tr:nth-child(2) td");
        System.out.println(rowValue);
    }
}
