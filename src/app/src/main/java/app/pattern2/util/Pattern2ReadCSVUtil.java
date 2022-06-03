package app.pattern2.util;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

public class Pattern2ReadCSVUtil<T> {
    public  List<T> readCSV(Class<T> bean, String path) throws Exception{
        File file = new File(path);
        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
            CsvToBeanBuilder<T> builder = new CsvToBeanBuilder<T>(csvReader);
            builder.withType(bean);                      
            return builder.build().parse();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
}
