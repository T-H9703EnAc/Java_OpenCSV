package app.pattern1.services;

import java.util.ArrayList;
import java.util.List;

import app.pattern1.interfaces.Pattern1OpenCsvImpl;
import app.pattern1.util.Pattern1ReadCSVUtil;

public class Pattern1ReadService implements Pattern1OpenCsvImpl{

    @Override
    public void callService() {
        List<String[]> csvDataList = new ArrayList<>();
        try {
            csvDataList = Pattern1ReadCSVUtil.readCSV(DEFAULT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(String[] array : csvDataList){
            for(String str: array){
                System.out.print(str + " ");
            }
            System.out.println();
        }
        
    }    
}
