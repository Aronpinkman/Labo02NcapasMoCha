package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    private User user;

    @Column(nullable = false)
    private LocalDate checkIn;

    @Column(nullable = false)
    private LocalDate checkOut;

    @Column(nullable = false)
    private boolean active;

    @ManyToOne
    private Room room;

    @ManyToOne
    private EventHall eventHall;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Receipt receipt;
}