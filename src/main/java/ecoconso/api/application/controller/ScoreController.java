package ecoconso.api.application.controller;

import ecoconso.api.application.service.ScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ScoreController {

    private ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping(value = "/get-score")
    public String getScore(@RequestParam String code) throws IOException {
        return scoreService.getScore(code);
    }
    @GetMapping(value = "/get-average-score")
    public String getScore(@RequestParam List<String> codes) throws IOException {
        return scoreService.getAverageScore(codes);
    }


}
