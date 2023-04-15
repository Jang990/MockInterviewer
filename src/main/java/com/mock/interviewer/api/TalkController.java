package com.mock.interviewer.api;

import com.mock.interviewer.api.service.chatgpt.ChatGPTService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TalkController {
    private final ChatGPTService chatGPTService;
    @PostMapping("/talk-test")
    public String talk(@RequestBody String clientTalk) {
        log.info("talk 메서드 호출 사용자 음성 내용: {}", clientTalk);
        chatGPTService.sendMessageToGPT(clientTalk);
        return "안녕하세요. Talk 테스트입니다.";
    }
}
