package org.example.labo2mocha.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends Person {
    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @OneToOne(mappedBy = "user")
    private Loyalty loyalty;
}