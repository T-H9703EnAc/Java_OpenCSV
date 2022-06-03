package app.pattern2.controller;

import app.pattern2.interfaces.Pattern2OpenCsvImpl;
import app.pattern2.services.Pattern2ReadService;
import app.pattern2.services.Pattern2WriteService;

public class Pattern2OpenCsvController {
    public Pattern2OpenCsvController(String[] args) {
        switch (args[0]) {
            case "1":
                Pattern2OpenCsvImpl writeService = new Pattern2WriteService();
                writeService.callService();
                break;
            case "2":
                Pattern2OpenCsvImpl readService = new Pattern2ReadService();
                readService.callService();
                break;
            default:
                break;
        }
    }
}
