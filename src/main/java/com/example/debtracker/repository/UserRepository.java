package com.example.debtracker.repository;
import com.example.debtracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM USER WHERE email = ?1", nativeQuery = true)
    User findByEmailAddress(String emailAddress);
}
