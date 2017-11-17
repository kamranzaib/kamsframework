package searching;

import Utility.DataReader;
import base.CommonAPI;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {

    DataReader dr = new DataReader();
    public String [] getDataFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"/data/file.xls";
        String [] st = dr.fileReader(path);
        return st;


    }
}
