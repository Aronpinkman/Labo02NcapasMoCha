package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;


import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToOne
    private Colors buttonColor;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "floor")
    private List<Room> rooms;
}