package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

import lombok.NoArgsConstructor;


import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Room room;

    private LocalDate date;
    private String time;
    private String description;
    private String reportedBy;
}
