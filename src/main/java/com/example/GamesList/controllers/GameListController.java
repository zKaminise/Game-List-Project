package com.example.GamesList.controllers;

import com.example.GamesList.DTO.GameListDTO;
import com.example.GamesList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> findAllLists = gameListService.findAll();
        return findAllLists;
    }
}
