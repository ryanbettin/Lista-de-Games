package com.ryanbettin.ListGames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryanbettin.ListGames.dto.GameMinDTO;
import com.ryanbettin.ListGames.entities.Game;
import com.ryanbettin.ListGames.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList(); 
		
		
			
	}				
}
