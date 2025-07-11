package com.startup.campusmate.domain.user.repository;

import com.startup.campusmate.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    boolean existsByStudentNum(String studentNum);
    Optional<User> findByEmail(String email);
}
