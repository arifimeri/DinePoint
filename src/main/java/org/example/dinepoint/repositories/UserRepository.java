package org.example.dinepoint.repositories;

import org.example.dinepoint.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByName(String name);
    List<User> findAllByEmail(String email);
    List<User> findAllByBirthdate(LocalDate birthdate);
}