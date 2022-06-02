package app.pattern1.controller;

import app.pattern1.interfaces.Pattern1OpenCsvImpl;
import app.pattern1.services.Pattern1ReadService;
import app.pattern1.services.Pattern1WriteService;

public class Pattern1OpenCsvController {
    public Pattern1OpenCsvController(String[] args) {
        switch (args[0]) {
            case "1":
                Pattern1OpenCsvImpl writeService = new Pattern1WriteService();
                writeService.callService();
                break;
            case "2":
                Pattern1OpenCsvImpl readService = new Pattern1ReadService();
                readService.callService();
                break;
            default:
                break;
        }
    }
}
