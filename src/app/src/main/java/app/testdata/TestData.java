package app.testdata;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static List<String[]> getestData1(){
        List<String[]> dataList = new ArrayList<String[]>();
        String[] line1 = {"id","name","age","gender"};
        String[] line2 = {"1","Tarou","20","man"};
        String[] line3 = {"2","Maki","18","woman"};
        dataList.add(line1);
        dataList.add(line2);
        dataList.add(line3);
        return dataList;
    }
}
