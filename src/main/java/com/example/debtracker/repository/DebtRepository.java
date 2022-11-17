package com.example.debtracker.repository;
import com.example.debtracker.models.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt,Long> {
}
