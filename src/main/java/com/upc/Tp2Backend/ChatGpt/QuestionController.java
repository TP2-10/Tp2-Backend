package com.upc.Tp2Backend.ChatGpt;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final ChatgptService chatgptService;

    @GetMapping("/send")
    public String send(@RequestParam String message){
        String responseMessage = chatgptService.sendMessage(message);
        return responseMessage;
    }

}