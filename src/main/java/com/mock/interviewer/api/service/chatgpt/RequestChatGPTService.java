package com.mock.interviewer.api.service.chatgpt;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class RequestChatGPTService implements ChatGPTService {
    @Override
    public String sendMessageToGPT(String talk) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth("YOUR_API_KEY"); // 여기에 본인의 API 키를 입력하세요

        String url = "https://api.openai.com/v1/engines/davinci-codex/completions";

        String requestBody = "{\"prompt\": \"Hello, ChatGPT!\", \"max_tokens\": 5}"; // 필요한 매개변수를 JSON 형식으로 전달합니다.

        String response = restTemplate.postForObject(url, new HttpEntity<>(requestBody, headers), String.class);
        System.out.println(response); // ChatGPT로부터 받은 JSON 형식의 응답을 출력합니다.


        return null;
    }
}
