package com.codeclan.example.player_quiz_service.repository;

import com.codeclan.example.player_quiz_service.models.IncorrectAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncorrectAnswerRepository extends JpaRepository<IncorrectAnswer, Long> {
}
