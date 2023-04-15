package com.mock.interviewer.api.service.chatgpt;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import com.theokanning.openai.image.CreateImageRequest;
import com.theokanning.openai.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@PropertySource("classpath:config.properties")
public class OpenAIChatGPTService implements ChatGPTService{
    @Value("${openai.key}")
    private String key;
    @Override
    public String sendMessageToGPT(String talk) {
        OpenAiService service = new OpenAiService(key);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(talk)
                .model("gpt-3.5-turbo")
                .echo(true)
                .maxTokens(3)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
        return "";
    }
}
