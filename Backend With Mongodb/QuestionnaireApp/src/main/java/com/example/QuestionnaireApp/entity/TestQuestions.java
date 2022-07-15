package com.example.QuestionnaireApp.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;


@Document(collection = "questions")
public class TestQuestions {

    @Id
    private int id;

    private String lectureName;
    private String subjectName;
    private String description;
    private int minForOneQuestion;
    private List<Question> questionList;

    public TestQuestions(int id,String lectureName,String subjectName,String description,int minForOneQuestion,
                         List<Question> questionList ){

        this.id = id;
        this.lectureName = lectureName;
        this.subjectName = subjectName;
        this.description = description;
        this.minForOneQuestion = minForOneQuestion;
        this.questionList = questionList;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinForOneQuestion() {
        return minForOneQuestion;
    }

    public void setMinForOneQuestion(int minForOneQuestion) {
        this.minForOneQuestion = minForOneQuestion;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
