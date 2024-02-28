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
}
