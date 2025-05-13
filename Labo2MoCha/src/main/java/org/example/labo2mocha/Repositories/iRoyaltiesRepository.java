package org.example.labo2mocha.Repositories;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.Royalties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface iRoyaltiesRepository extends JpaRepository<Royalties, UUID> {

}
