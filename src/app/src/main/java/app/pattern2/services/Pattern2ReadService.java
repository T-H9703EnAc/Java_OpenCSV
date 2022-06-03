package app.pattern2.services;

import java.util.ArrayList;
import java.util.List;

import app.pattern2.bean.UserInfoBean2;
import app.pattern2.interfaces.Pattern2OpenCsvImpl;
import app.pattern2.util.Pattern2ReadCSVUtil;

public class Pattern2ReadService implements Pattern2OpenCsvImpl{

    @Override
    public void callService() {
        List<UserInfoBean2> dataList = new ArrayList<UserInfoBean2>();        
        try {
            Pattern2ReadCSVUtil<UserInfoBean2> csvUtil = new Pattern2ReadCSVUtil<UserInfoBean2>();
            dataList = csvUtil.readCSV(UserInfoBean2.class, DEFAULT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(UserInfoBean2 info : dataList){
            System.out.println(info);
        }
    }
    
}
