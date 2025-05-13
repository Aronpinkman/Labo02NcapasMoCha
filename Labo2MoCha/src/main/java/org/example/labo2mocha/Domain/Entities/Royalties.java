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
public class Royalties {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;
    private int pointCost;
}
