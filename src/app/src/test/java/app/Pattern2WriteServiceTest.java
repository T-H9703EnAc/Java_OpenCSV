package app;

import org.junit.Test;

import app.pattern2.interfaces.Pattern2OpenCsvImpl;
import app.pattern2.services.Pattern2WriteService;

public class Pattern2WriteServiceTest {
    @Test
    public void test1(){
        Pattern2OpenCsvImpl serv = new Pattern2WriteService();
        serv.callService();
    }
}
