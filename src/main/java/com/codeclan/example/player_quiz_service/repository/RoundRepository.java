package com.codeclan.example.player_quiz_service.repository;

import com.codeclan.example.player_quiz_service.models.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {
}
