package com.codeclan.example.player_quiz_service.components;

import com.codeclan.example.player_quiz_service.models.IncorrectAnswer;
import com.codeclan.example.player_quiz_service.models.Quiz;
import com.codeclan.example.player_quiz_service.models.QuizQuestion;
import com.codeclan.example.player_quiz_service.models.Round;
import com.codeclan.example.player_quiz_service.repository.IncorrectAnswerRepository;
import com.codeclan.example.player_quiz_service.repository.QuizQuestionRepository;
import com.codeclan.example.player_quiz_service.repository.QuizRepository;
import com.codeclan.example.player_quiz_service.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    RoundRepository roundRepository;

    @Autowired
    QuizQuestionRepository quizQuestionRepository;

    @Autowired
    IncorrectAnswerRepository incorrectAnswerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        incorrectAnswerRepository.deleteAll();
        quizQuestionRepository.deleteAll();
        roundRepository.deleteAll();
        quizRepository.deleteAll();

        Quiz quiz1 = new Quiz("History Quiz");
        quizRepository.save(quiz1);

        Round round1 = new Round(quiz1);
        roundRepository.save(round1);

        QuizQuestion quizQuestion1 = new QuizQuestion("1", "1", "1", "1", round1);
        quizQuestionRepository.save(quizQuestion1);

        ArrayList<String> newArray = new ArrayList<String>();
        newArray.add("a");
        newArray.add("b");
        newArray.add("c");
        newArray.add("d");
        IncorrectAnswer incorrectAnswer1 = new IncorrectAnswer(newArray);
        incorrectAnswerRepository.save(incorrectAnswer1);
    }
}
