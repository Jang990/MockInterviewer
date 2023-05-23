package com.mock.interviewer.api.service.chatgpt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class OpenAIChatGPTServiceTest {
    private ChatGPTService service = new OpenAIChatGPTService();

    @Test
    public void testTalk() throws Exception {
        //given
        String talk = "Hello World!";

        //when
        service.sendMessageToGPT(talk);

        //then

    }
}