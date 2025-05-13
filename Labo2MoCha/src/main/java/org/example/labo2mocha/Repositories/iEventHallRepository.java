package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.EventHall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface iEventHallRepository extends JpaRepository<EventHall, UUID> {

}
