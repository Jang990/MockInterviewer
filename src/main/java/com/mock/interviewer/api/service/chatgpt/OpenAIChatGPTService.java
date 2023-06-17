package com.mock.interviewer.api.service.chatgpt;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;


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
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
        return "";
    }
}
