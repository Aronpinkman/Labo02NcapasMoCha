package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.RotationTurn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iRotationTurnRepository extends JpaRepository<RotationTurn, UUID> {

    @Query("SELECT r FROM RotationTurn r WHERE r.month = :month AND r.active = true")
    List<RotationTurn> findActiveByMonth(@Param("month") String month);


    @Query("SELECT r FROM RotationTurn r WHERE r.floor.id = :floorId AND r.month = :month")
    List<RotationTurn> findByFloorAndMonth(@Param("floorId") UUID floorId,
                                           @Param("month") String month);
}
