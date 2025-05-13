package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Colors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface iColorsRepository extends JpaRepository<Colors, UUID> {

}