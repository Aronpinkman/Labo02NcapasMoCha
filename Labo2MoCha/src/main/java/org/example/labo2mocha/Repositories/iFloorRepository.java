package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.Floor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface iFloorRepository extends JpaRepository<Floor, UUID> {

    List<Floor> findByBranchId(UUID branchId);
}