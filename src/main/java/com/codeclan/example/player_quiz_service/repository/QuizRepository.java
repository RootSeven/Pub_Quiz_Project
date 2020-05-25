package com.codeclan.example.player_quiz_service.repository;

import com.codeclan.example.player_quiz_service.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository <Quiz, Long> {

}
