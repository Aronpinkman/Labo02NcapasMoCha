package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Person {
    @ManyToOne
    private Branch branch;

    @ManyToOne
    private Role role;

    @ManyToOne
    private Employee supervisor;

    private boolean isCoordinator;
}
