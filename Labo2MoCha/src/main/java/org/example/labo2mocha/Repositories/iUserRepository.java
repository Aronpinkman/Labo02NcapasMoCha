package org.example.labo2mocha.Repositories;



import org.example.labo2mocha.Domain.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface iUserRepository extends JpaRepository<User, UUID> {

    User findByFirstName(String firstName);


    @Query(value = "SELECT * FROM user_data WHERE first_name = :firstName", nativeQuery = true)
    User findNativeByFirstname(@Param("firstName") String firstName);
}