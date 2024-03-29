package com.quizapp.quizapp.service;

import com.quizapp.quizapp.dao.QuestionDao;
import com.quizapp.quizapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestion(){
       return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }



    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }
}
