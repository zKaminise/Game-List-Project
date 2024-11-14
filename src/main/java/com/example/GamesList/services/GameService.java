package com.example.GamesList.services;


import com.example.GamesList.DTO.GameMinDTO;
import com.example.GamesList.entities.Game;
import com.example.GamesList.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gamesRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
