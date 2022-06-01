package app;

import org.junit.Test;

import app.pattern1.interfaces.Pattern1OpenCsvImpl;
import app.pattern1.services.Pattern1WriteService;

public class Pattern1WriteServiceTest {
    @Test
    public void test1(){
        Pattern1OpenCsvImpl serv = new Pattern1WriteService();
        serv.callService();
    }
}
