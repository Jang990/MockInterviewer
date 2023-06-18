package com.mock.interviewer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeechController {
    @GetMapping("/interview/setting")
    public String speechPage() {
        return "interview/interview-setting";
    }

    @GetMapping("/speech-V2")
    public String speechPageV2() {
        return "interview/speechV2";
    }

    @GetMapping("/talk")
    public String talkPage() {
        return "interview/talk";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("auth/login")
    public String login() {
        return "/auth/login";
    }

    @GetMapping("auth/sign-up")
    public String signUp() {
        return "/auth/sign-up";
    }
}
