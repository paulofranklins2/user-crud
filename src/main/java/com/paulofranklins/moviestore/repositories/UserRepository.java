package com.paulofranklins.moviestore.repositories;

import com.paulofranklins.moviestore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
