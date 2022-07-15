package com.example.QuestionnaireApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class ClassTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classId;

    @Column(unique = true, nullable = false)
    private String className;

    @Column
    private Integer noOfStudents;

    @Column
    private Date fromDate;

    @Column
    private Date toDate;

    @Column
    private Date createdAt;

    @OneToOne
            (
                    targetEntity = User.class,
                    optional = false
            )
    private User user;




}
