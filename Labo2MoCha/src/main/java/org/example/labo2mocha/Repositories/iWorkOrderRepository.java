package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iWorkOrderRepository extends JpaRepository<WorkOrder, UUID> {
    @Query("SELECT w FROM WorkOrder w WHERE w.room.id = :roomId ORDER BY w.date DESC, w.time DESC")
    List<WorkOrder> findWorkOrdersByRoom(@Param("roomId") UUID roomId);
}
