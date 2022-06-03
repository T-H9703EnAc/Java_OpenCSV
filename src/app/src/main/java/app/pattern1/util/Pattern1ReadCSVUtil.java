package app.pattern1.util;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class Pattern1ReadCSVUtil {
    /**
     * CSVファイルを読み込む
     * @param path CSVファイルのパス
     * @return 読み込んだCSVデータ
     * @throws Exception
     */
    public static List<String[]> readCSV(String path) throws Exception{
        File file = new File(path);
        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {            
            return csvReader.readAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }   
}
