package com.nikhil.Quiz.Application.service;

import com.nikhil.Quiz.Application.entity.Question;
import com.nikhil.Quiz.Application.repo.QuizRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepo quizRepo;

    public List<Question> getQuestions(String topic){
        return quizRepo.findRandomlyByTopic(topic);
    }

    @Transactional
    public List<Question> addQuestion(List<Question> question){
        return quizRepo.saveAll(question);
    }


}
