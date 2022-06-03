package app.pattern1.util;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVWriter;

public class Pattern1WriteCSVUtil {
    /**
     * CSVファイルを出力する
     * @param path CSVファイルのパス
     * @param dataList 書き込むデータリスト
     * @throws Exception
     */
    public static void writeCSV(String path, List<String[]> dataList) throws Exception{
        File file = new File(path);
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file))) {
            csvWriter.writeAll(dataList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }
}
