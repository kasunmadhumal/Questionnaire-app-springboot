package com.example.QuestionnaireApp.service;


import com.example.QuestionnaireApp.entity.TestQuestions;
import com.example.QuestionnaireApp.entity.response.AddTestQuestionResponse;
import com.example.QuestionnaireApp.entity.response.TestQuestionsResponse;
import com.example.QuestionnaireApp.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LectureService {

    @Autowired
    private QuestionsRepository questionsRepository;

    public AddTestQuestionResponse insertTestQuestions(TestQuestions testQuestions){

        questionsRepository.save(testQuestions);

        return new AddTestQuestionResponse(testQuestions.getLectureName(),testQuestions.getSubjectName(),testQuestions.getDescription());
    }


    public List<TestQuestions> getTestQuestions(String subjectName){

        return questionsRepository.getTestQuestions(subjectName);

    }







}






