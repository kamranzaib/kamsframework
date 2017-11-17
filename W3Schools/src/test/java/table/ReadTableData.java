package table;

import dataTable.ScrapTableData;
import org.testng.annotations.Test;

public class ReadTableData extends ScrapTableData{
    @Test
    public void testTable(){
        readData();
    }
}
