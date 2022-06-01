package app.pattern1.services;

import app.pattern1.interfaces.Pattern1OpenCsvImpl;
import app.pattern1.util.Pattern1WriteCSVUtil;
import app.testdata.TestData;

public class Pattern1WriteService implements Pattern1OpenCsvImpl{

    @Override
    public void callService() {
        try {
            Pattern1WriteCSVUtil.writeCSV(DEFAULT_PATH, TestData.getestData1());
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }    
}
