package com.ryanbettin.ListGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryanbettin.ListGames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
