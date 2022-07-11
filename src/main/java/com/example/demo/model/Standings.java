package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Standings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstTeam;

    @Column(nullable = false)
    private String secondTeam;

    @Column(nullable = false)
    private String result;

    public Standings(String firstTeam, String secondTeam, String result) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.result = result;
    }
}
