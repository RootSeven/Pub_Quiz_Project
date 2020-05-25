package com.codeclan.example.player_quiz_service.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="incorrect_answers")
public class IncorrectAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="incorrect_answers_id", nullable=false)
    private List<String> incorrectAnswers;

    public IncorrectAnswer(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    public IncorrectAnswer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}
