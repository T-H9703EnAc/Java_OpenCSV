package app.pattern2.bean;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.Data;

@Data
public class UserInfoBean {
    @CsvBindByPosition(position = 0)
    @CsvBindByName(column = "ID", required = true)
    private int id;

    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "名前", required = true)
    private String name;

    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "年齢", required = true)
    private int age;

    @CsvBindByPosition(position = 3)
    @CsvBindByName(column = "所属", required = true)
    private String belong;

    public UserInfoBean(int id, String name, int age, String belong){
        this.id = id;
        this.name = name;
        this.age = age;
        this.belong = belong;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }
}
