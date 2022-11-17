package com.example.debtracker.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String tel;
    int type;
    double amount;
    @Column(name = "debt_date ")
    private LocalDateTime debt_date;
    @Column(name = "due_date ")
    private LocalDateTime due_date;
    @OneToOne
    @JoinColumn(name = "User_id", referencedColumnName = "id")
    private User user;
}