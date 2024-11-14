package com.example.GamesList.controllers;

import com.example.GamesList.DTO.GameDTO;
import com.example.GamesList.DTO.GameMinDTO;
import com.example.GamesList.entities.Game;
import com.example.GamesList.services.GameService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> findAllGames = gameService.findAll();
        return findAllGames;
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}
