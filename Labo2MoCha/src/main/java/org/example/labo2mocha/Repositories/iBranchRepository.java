package org.example.labo2mocha.Repositories;

import org.example.labo2mocha.Domain.Entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface iBranchRepository extends JpaRepository<Branch, UUID> {
    // DERIVADA
    List<Branch> findByNameContainingIgnoreCase(String name);
}
