package com.quizapp.quizapp.controller;

import com.quizapp.quizapp.entity.Question;
import com.quizapp.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @RequestMapping("/all question")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }
}
