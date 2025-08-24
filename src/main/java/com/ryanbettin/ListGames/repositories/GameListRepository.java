package com.ryanbettin.ListGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryanbettin.ListGames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
 
}
