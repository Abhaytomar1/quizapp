package com.quizapp.quizapp.dao;

import com.quizapp.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question>findByCategory(String category);
}
