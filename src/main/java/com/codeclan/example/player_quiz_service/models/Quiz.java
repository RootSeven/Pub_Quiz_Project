package com.codeclan.example.player_quiz_service.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="quiz_name")
    private String quizName;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
    private List<Round> rounds;

    public Quiz() {
    }

    public Quiz(String quizName) {
        this.quizName = quizName;
        this.rounds = new ArrayList<Round>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }
}

