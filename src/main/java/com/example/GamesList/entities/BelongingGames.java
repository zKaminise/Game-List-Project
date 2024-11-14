package com.example.GamesList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class BelongingGames {

    @EmbeddedId
    private BelongingGamesPK id;

    private Integer position;

    public BelongingGames(Game game, GameList gameList,Integer position) {
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }
}
