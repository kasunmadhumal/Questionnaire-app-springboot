package com.example.QuestionnaireApp.controller;


import com.example.QuestionnaireApp.entity.TestQuestions;
import com.example.QuestionnaireApp.entity.response.AddTestQuestionResponse;
import com.example.QuestionnaireApp.entity.response.TestQuestionsResponse;
import com.example.QuestionnaireApp.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LectureController {

    @Autowired
    private LectureService lectureService;


    //   create test
    @PostMapping("/lectures/add_new_tests_questions/")
    public AddTestQuestionResponse addNewTestQuestions(@RequestBody TestQuestions testQuestions) {


        return lectureService.insertTestQuestions(testQuestions);

    }


    //get selected course id test paper
    @GetMapping("/lectures/get_tests_questions/{subjectName}")
    public List<TestQuestions> getTestQuestions(@PathVariable String subjectName) {

        return lectureService.getTestQuestions(subjectName);
    }



}
