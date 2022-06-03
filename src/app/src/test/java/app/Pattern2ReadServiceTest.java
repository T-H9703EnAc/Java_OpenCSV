package app;

import org.junit.Test;

import app.pattern2.interfaces.Pattern2OpenCsvImpl;
import app.pattern2.services.Pattern2ReadService;

public class Pattern2ReadServiceTest {
    @Test
    public void test1(){
        Pattern2OpenCsvImpl serv = new Pattern2ReadService();
        serv.callService();
    }
}
