package app.pattern2.services;

import app.pattern2.bean.UserInfoBean;
import app.pattern2.interfaces.Pattern2OpenCsvImpl;
import app.pattern2.util.Pattern2WriteCSVUtil;
import app.testdata.TestData;

public class Pattern2WriteService implements Pattern2OpenCsvImpl{

    @Override
    public void callService() {
        try {
            Pattern2WriteCSVUtil<UserInfoBean> csvUtil = new Pattern2WriteCSVUtil<>();
            csvUtil.writeCSV(TestData.getestData2(),UserInfoBean.class, DEFAULT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }  
        
    }
    
}
