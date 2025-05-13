package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface iEmployeeRepository extends JpaRepository<Employee, UUID> {

    @Query("SELECT e FROM Employee e WHERE e.branch.id = :branchId AND e.isCoordinator = true")
    List<Employee> findCoordinatorsByBranch(@Param("branchId") UUID branchId);


    @Query("SELECT e FROM Employee e WHERE e.supervisor.idPerson = :supervisorId")
    List<Employee> findBySupervisor(@Param("supervisorId") UUID supervisorId);


    List<Employee> findByBranchId(UUID branchId);
}