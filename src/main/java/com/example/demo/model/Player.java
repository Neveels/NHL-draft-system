package com.example.demo.model;

import com.example.demo.enums.PlayerPosition;
import com.example.demo.enums.PlayerStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Player")
@Table
@NoArgsConstructor
@Data
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "player_sequence"
    )
    //We do not update our id
    @Column(updatable = false)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 15)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 15)
    private String lastName;

    @Column(nullable = false)
    private Integer age;

    @Column()
    private Integer goals;

    @Column()
    private Integer assists;

    @Column(name = "player_position", nullable = false)
    @Enumerated(EnumType.STRING)
    private PlayerPosition playerPosition;

    @Column(nullable = false, name = "player_status")
    @Enumerated(EnumType.STRING)
    private PlayerStatus playerStatus;

    @Column(nullable = false)
    private Integer price;

    public Player(String firstName, String lastName, Integer age, Integer goals, Integer assists, Integer price) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
        this.price = price;
    }
}
