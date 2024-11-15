package com.example.GamesList.services;


import com.example.GamesList.DTO.GameDTO;
import com.example.GamesList.DTO.GameMinDTO;
import com.example.GamesList.entities.Game;
import com.example.GamesList.projections.GameMinProjection;
import com.example.GamesList.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GamesRepository gamesRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gamesRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gamesRepository.findById(id).get(); //Fazer um tratamento de exceção para caso o ID nao exista
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gamesRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
