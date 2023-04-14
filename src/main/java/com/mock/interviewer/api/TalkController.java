package com.mock.interviewer.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TalkController {
    @PostMapping("/talk-test")
    public String talk(@RequestBody String clientTalk) {
        log.info("talk 메서드 호출 사용자 음성 내용: {}", clientTalk);
        return "안녕하세요. Talk 테스트입니다.";
    }
}
