package com.app.QuizApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionsController {

    @GetMapping("allQuestions")
    public String allQuestions(){
        return "test";
    }
}
