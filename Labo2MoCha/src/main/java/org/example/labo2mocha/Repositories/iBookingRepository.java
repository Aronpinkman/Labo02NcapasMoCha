package org.example.labo2mocha.Repositories;

import org.example.labo2mocha.Domain.Entities.Booking;
import org.example.labo2mocha.Domain.Entities.Branch;
import org.example.labo2mocha.Domain.Entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface iBookingRepository extends JpaRepository<Booking, UUID> {
    // JPA
    @Query("SELECT b FROM Booking b WHERE b.room = :room AND b.active = true AND (" +
            "(:checkIn BETWEEN b.checkIn AND b.checkOut) OR " +
            "(:checkOut BETWEEN b.checkIn AND b.checkOut) OR " +
            "(:checkIn <= b.checkIn AND :checkOut >= b.checkOut))")
    List<Booking> findConflictingBookings(@Param("room") Room room,
                                          @Param("checkIn") LocalDate checkIn,
                                          @Param("checkOut") LocalDate checkOut);

    // NATIVA
    @Query(value = "SELECT * FROM booking WHERE user_id = :userId", nativeQuery = true)
    List<Booking> findByUserNative(@Param("userId") UUID userId);

    // DERIVADA
    List<Booking> findByActiveTrue();
}

