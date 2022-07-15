package com.example.QuestionnaireApp.controller;


import com.example.QuestionnaireApp.model.SAQuestions;
import com.example.QuestionnaireApp.service.QuestionsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/questions")
public class QuestionsController {

    private final QuestionsService questionsService;

    public QuestionsController(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> save(@RequestBody SAQuestions data){
        try {
            questionsService.saveQuestions(data);
            return ResponseEntity.status(HttpStatus.OK).body("question created");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /**
     * get question by QuestionnaireId
     * @param id
     * @return
     */
    @GetMapping("/getQuestion/{id}")
    public ResponseEntity<?> getQuestionByQuestionnaireId(@PathVariable("id") int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(questionsService.getQuestionByQuestionnaireId(id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @GetMapping("/getQuestionById/{id}")
    public ResponseEntity<?> getQuestion(@PathVariable("id") int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(questionsService.getQuestion(id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    /**
     * update question
     * @param id
     * @return
     */
    @PutMapping("/updateQuestion/{id}")
    public ResponseEntity<?> updateQuestion(@PathVariable("id") int id, @RequestBody SAQuestions SAQuestions){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(questionsService.updateQuestion(id, SAQuestions));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteQuestion(@PathVariable("id") int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(questionsService.deleteQuestion(id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
