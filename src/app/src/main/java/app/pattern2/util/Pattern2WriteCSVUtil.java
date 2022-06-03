package app.pattern2.util;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class Pattern2WriteCSVUtil<T>{
    public void writeCSV(List<T> beanList, Class<T> bean, String path) throws Exception {
        File file = new File(path); 
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file))) {
        CustomMappingStrategy<T> mappingStrategy = new CustomMappingStrategy<>();
        mappingStrategy.setType(bean);
        StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(csvWriter)
        .withSeparator(CSVWriter.DEFAULT_SEPARATOR)        
        .withMappingStrategy(mappingStrategy)
        .build();
        beanToCsv.write(beanList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }     
    }
}
