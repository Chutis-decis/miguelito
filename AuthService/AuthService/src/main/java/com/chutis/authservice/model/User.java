package com.chutis.authservice.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column (unique = true, nullable = false)
    private String password;

    private String rol;

}
