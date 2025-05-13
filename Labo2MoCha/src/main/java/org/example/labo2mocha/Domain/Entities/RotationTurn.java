package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RotationTurn {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Floor floor;

    private String shift; // Morning, Afternoon, Night
    private String month;
    private boolean active;
}