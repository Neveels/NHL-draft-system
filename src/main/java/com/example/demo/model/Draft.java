package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Draft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //TODO: Here should be team name his pick and name/lastname of player

}
