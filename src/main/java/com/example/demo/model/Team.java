package com.example.demo.model;

import com.example.demo.enums.Teams;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 2, max = 20)
    @Enumerated(EnumType.STRING)
    private Teams teamName;

    @Column(nullable = false)
    private Integer numberOfPlayer;

    @Column(nullable = false)
    private Integer placeInTheTable;

    @Column(nullable = false, name = "points")
    private Integer point;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private List<Player> player;

    public Team(Teams teamName, Integer numberOfPlayer, Integer placeInTheTable, Integer point, List<Player> player) {
        this.teamName = teamName;
        this.numberOfPlayer = numberOfPlayer;
        this.placeInTheTable = placeInTheTable;
        this.point = point;
        this.player = player;
    }
}
