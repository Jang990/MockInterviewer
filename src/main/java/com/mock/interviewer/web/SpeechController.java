package com.mock.interviewer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeechController {
    @GetMapping("/speech")
    public String speechPage() {
        return "interview/speech";
    }

    @GetMapping("/speech-V2")
    public String speechPageV2() {
        return "interview/speechV2";
    }
}