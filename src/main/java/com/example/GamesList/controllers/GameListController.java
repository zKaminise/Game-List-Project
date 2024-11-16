package com.example.GamesList.controllers;

import com.example.GamesList.DTO.GameListDTO;
import com.example.GamesList.DTO.GameMinDTO;
import com.example.GamesList.DTO.ReplacementDTO;
import com.example.GamesList.services.GameListService;
import com.example.GamesList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId,@RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
