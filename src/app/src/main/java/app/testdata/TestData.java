package app.testdata;

import java.util.ArrayList;
import java.util.List;

import app.pattern2.bean.UserInfoBean;

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

    public static List<UserInfoBean> getestData2(){
        List<UserInfoBean> dataList = new ArrayList<UserInfoBean>();
        UserInfoBean user1 = new UserInfoBean(1,"Tanaka",10,"チームA");
        UserInfoBean user2 = new UserInfoBean(2,"Satou",20,"チームB");
        UserInfoBean user3 = new UserInfoBean(3,"Yamada",30,"チームC");
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        return dataList;
    }
}
