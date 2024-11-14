package com.example.GamesList.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_game_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
