package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.Loyalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iLoyaltyPointsRepository extends JpaRepository<Loyalty, UUID> {
    @Query("SELECT l FROM Loyalty l WHERE l.user.idPerson = :userId")
    Loyalty findByUser(@Param("userId") UUID userId);
}