package com.example.GamesList.repository;

import com.example.GamesList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Game, Long> {
}
