package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventHall {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private int capacity;
    private String description;

    @ManyToOne
    private Branch branch;
}
