package com.example.QuestionnaireApp.repository;

import com.example.QuestionnaireApp.entity.TestQuestions;
import com.example.QuestionnaireApp.entity.response.TestQuestionsResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionsRepository extends MongoRepository<TestQuestions,Integer> {


    @Query("{'subjectName':?0}")            // SQL Equivalent : SELECT * FROM BOOK where author = ?
    List<TestQuestions> getTestQuestions(String subjectName);


}
